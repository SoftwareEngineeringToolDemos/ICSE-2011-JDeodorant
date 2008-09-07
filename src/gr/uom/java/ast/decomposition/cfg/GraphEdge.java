package gr.uom.java.ast.decomposition.cfg;

public class GraphEdge {
	protected GraphNode src;
	protected GraphNode dst;
	
	public GraphEdge(GraphNode src, GraphNode dst) {
		this.src = src;
		this.dst = dst;
		src.addOutgoingEdge(this);
		dst.addIncomingEdge(this);
	}
}
