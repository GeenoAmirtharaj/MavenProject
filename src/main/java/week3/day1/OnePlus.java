package week3.day1;

public class OnePlus extends AndroidTV{
	@override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("PlayVideo i am calling from OnePlus class");
	}
	
	public static void main(String[] args) {
		OnePlus objOnePlus = new OnePlus();
		objOnePlus.playVideo();
		objOnePlus.openApp();
	}

}
