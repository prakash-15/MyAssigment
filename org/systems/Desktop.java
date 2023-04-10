package org.systems;

public class Desktop extends Computer  {
	
	
	protected void desktopSize()
	{
		System.out.println("The desktop size is 32 inch ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop size= new Desktop();
		
		size.ComputerModel();
		size.desktopSize();
	}

}
