package week3.day1;

public class SmartPhone extends AndroidPhone {
	public void connectWhatsApp(){
		System.out.println("Its me connect whatsapp");
	}
	
	public void takeVideo() {
		System.out.println("takevideo: Hey i am overrided");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.sendMessage();
		phone.makeCall();
		phone.saveContact();
		phone.takeVideo();
		phone.connectWhatsApp();
	}

}
