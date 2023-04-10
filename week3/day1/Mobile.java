package week3.day1;

public class Mobile {
	
	protected void sendmsg()
	{
		System.out.println("Msg is sent");
	}
	
	protected void makecall()
	{
		System.out.println("Call  is Maked");
	}
	
	protected void savecontect()
	{
		System.out.println("Contect  is Saved");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile mob=new Mobile();
		mob.sendmsg();
		mob.makecall();
		mob.savecontect();
	}

}
