package gr.uom.java.ast.decomposition.cfg;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class BasicBlockCFG {
	private List<BasicBlock> basicBlocks;
	
	public BasicBlockCFG(CFG cfg) {
		this.basicBlocks = new ArrayList<BasicBlock>();
		ListIterator<GraphNode> nodeIterator = cfg.nodes.listIterator();
		while(nodeIterator.hasNext()) {
			CFGNode node = (CFGNode)nodeIterator.next();
			if(node.isLeader()) {
				BasicBlock basicBlock = new BasicBlock(node);
				basicBlocks.add(basicBlock);
			}
			else {
				BasicBlock basicBlock = basicBlocks.get(basicBlocks.size()-1);
				basicBlock.add(node);
			}
		}
		BasicBlock.resetBlockNum();
	}
	
	public Set<BasicBlock> forwardReach(BasicBlock basicBlock) {
		Set<BasicBlock> reachableBlocks = new LinkedHashSet<BasicBlock>();
		reachableBlocks.add(basicBlock);
		List<CFGNode> basicBlockNodes = basicBlock.getNodes();
		CFGNode lastNode = null;
		if(!basicBlockNodes.isEmpty())
			lastNode = basicBlockNodes.get(basicBlockNodes.size()-1);
		else
			lastNode = basicBlock.getLeader();
		for(GraphEdge edge : lastNode.outgoingEdges) {
			Flow flow = (Flow)edge;
			if(!flow.isLoopbackFlow()) {
				CFGNode dstNode = (CFGNode)flow.dst;
				BasicBlock dstBasicBlock = dstNode.getBasicBlock();
				reachableBlocks.add(dstBasicBlock);
				reachableBlocks.addAll(forwardReach(dstBasicBlock));
			}
		}
		return reachableBlocks;
	}
}
