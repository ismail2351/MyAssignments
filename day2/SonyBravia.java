package week5.day2;

public class SonyBravia implements AndroidTvDesign,AdditionalSpecfications {

	public void changeChannel() {
		System.out.println("Able to change channel");
		
	}

	public void switchOnTv() {
		System.out.println("Switch On and Off TV");
		
	}

	public void increaseVolume() {
		System.out.println("Increase and Decrease volume");
		
	}

	public void accessApplications() {
		System.out.println("access applications online");
		
	}
	public void screenMirroring() {
		System.out.println("screen mirroring from connected device");
	}

	public void wifiConnecting() {
		System.out.println("able to connect  internet through wifi");
	}

	public void browsingInternet() {
		System.out.println("able to browse internet");
	}
	
public static void main(String[] args) {
	SonyBravia smarttv=new SonyBravia();
	smarttv.switchOnTv();
	smarttv.accessApplications();
	smarttv.changeChannel();
	smarttv.increaseVolume();
	smarttv.browsingInternet();
	smarttv.screenMirroring();
	smarttv.wifiConnecting();
}



}
