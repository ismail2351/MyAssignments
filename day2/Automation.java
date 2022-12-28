package week5.day2;

public class Automation extends MultipleLanguage implements Language,TestTool {

	@Override
	public void ruby() {
		
	}

	public void Java() {
		System.out.println("Java");
		
	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}
	public static void main(String[] args) {
		
		Automation obj=new Automation();
		obj.Java();
		obj.Selenium();
		obj.python();
	
}
}
