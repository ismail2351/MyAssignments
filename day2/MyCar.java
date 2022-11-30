package week1.day2;

public class MyCar {
	public void applyBreak()
	{
		System.out.println("Apply Break");
	}
	public void applyGear()
	{
		System.out.println("Apply Gear");
	}
	public void switchOnAc()
	{
	System.out.println("Switch On AC");
	}
	public void applyAcclerate()
	{
		System.out.println("Apply Accelerate");
	}
	public static void main(String[] args) {
		MyCar bmw=new MyCar();
		bmw.applyBreak();
		bmw.applyGear();
		bmw.switchOnAc();
		bmw.applyAcclerate();
	}
}

