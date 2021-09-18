package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("The Desktop size is 15");

	}

	public static void main(String[] args) {
		Desktop obj1=new Desktop();
		
		
		obj1.desktopSize();
		obj1.computerModel();
		
	}
}
