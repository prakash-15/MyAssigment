package week3.day1;

public class AndroidPhone extends Mobile {

	protected void takevideo()
	{
		System.out.println("Video is taken");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AndroidPhone ap=new AndroidPhone();
				ap.takevideo();
				ap.sendmsg();
				ap.makecall();
				ap.savecontect();
	}

}
