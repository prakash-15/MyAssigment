package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	protected void connectwhatsapp()
	{
		System.out.println("Whatsapp connect");
	}
	
	
	public void takevideo()
	{
		System.out.println("Video is taken from smartphone");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone sp=new SmartPhone();
		sp.connectwhatsapp();
		sp.takevideo();
		sp.sendmsg();
		sp.makecall();
		sp.savecontect();
	}
	

}
