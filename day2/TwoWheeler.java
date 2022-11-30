package week1.day2;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chasisNumber=12345789L;
	boolean isPunctured=false;
	String bikeName="Duke";
	double runningKM=35786.98;
	
	public static void main(String[] args)
{
		TwoWheeler bike=new TwoWheeler();
		System.out.println("noOfWheels "+bike.noOfWheels);
		System.out.println("noOfMirrors "+bike.noOfMirrors);
		System.out.println("chasisNumber "+bike.chasisNumber);
		System.out.println("isPunctured "+bike.isPunctured);
		System.out.println("bikeName "+bike.bikeName);
		System.out.println("runningKM "+bike.runningKM);
	}

}

