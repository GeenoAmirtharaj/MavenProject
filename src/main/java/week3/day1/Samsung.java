package week3.day1;

public class Samsung extends AndroidTV{
	
	@override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("Play Video: I am inside Samsung class");
	}
	
	public static void main(String[] args) {
		Samsung objSamsung = new Samsung();
		objSamsung.playVideo();
		objSamsung.openApp();
	}

}
