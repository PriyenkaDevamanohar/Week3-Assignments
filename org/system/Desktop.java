package org.system;

public class Desktop extends Computer{
	public void DesktopSize() {
		System.out.println("DesktopSize-Desktop");

	}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.DesktopSize();
		desk.ComputerModel();
		

	}

}
