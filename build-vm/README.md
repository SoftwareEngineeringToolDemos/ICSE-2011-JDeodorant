# Contents of build-vm folder

In this folder, you will find:

* **Vagrantfile** - Contains the vagrant script to load the Ubuntu 14.04 Desktop VM on VirtualBox with a default memory of 2048 MB

# Minimum Requirements for using this Vagrant Script
1. Any 64-bit OS.
2. VirtualBox.
3. Vagrant.

# Steps to create the VM using Vagrant

1. Download and install [Vagrant](https://www.vagrantup.com/downloads.html) appropriate to your host OS.
2. Download and install [VirtualBox](https://www.virtualbox.org/wiki/Downloads) appropriate to your host OS.
3. Copy the [Vagrantfile](https://github.com/SoftwareEngineeringToolDemos/ICSE-2011-JDeodorant/blob/master/build-vm/Vagrantfile) from [build-vm](https://github.com/SoftwareEngineeringToolDemos/ICSE-2011-JDeodorant/tree/master/build-vm) to your host OS.
4. Open command prompt (on Windows) or terminal (on Linux) and change the current directory to where the "Vagrantfile" was copied to.
5. Type the following in the command prompt or terminal: `vagrant up --provider virtualbox`
6. The vagrant file will begin executing an at some point the VM will start up on VirtualBox. 
7. Please wait for the vagrant script to complete executing before using the VM.


# Details of the built VM

As part of the load process, the following is loaded in the VM (as part of the Vagrant script)

1. Ubuntu Desktop 14.04
  * Default username: *vagrant*
  * Default password: *vagrant*
2. Java 8.
3. Eclipse 4.5.1 Mars

###Acknowledgements:
Used vagrant virtual box image of [64 bit ubuntu](https://atlas.hashicorp.com/boxcutter/boxes/ubuntu1404-desktop).

###References:
[Vagrant Documentation](https://docs.vagrantup.com/v2/getting-started/)

[Vagrant Blog](https://www.vagrantup.com/blog.html)

[Tutorial to install java](https://www.digitalocean.com/community/tutorials/how-to-install-java-on-ubuntu-with-apt-get)

[Ubuntu 14.04 Virtual Box](https://atlas.hashicorp.com/boxcutter/boxes/ubuntu1404-desktop)