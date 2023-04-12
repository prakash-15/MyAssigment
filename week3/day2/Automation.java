package week3.day2;

public class Automation extends MultipleLangauge {

	

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java language");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("automation tool");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby lanuguage");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation Auto =new Automation();
		Auto.python();
		Auto.Selenium();
		Auto.ruby();
		Auto.Java();
	}
}
