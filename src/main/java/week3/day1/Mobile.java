package week3.day1;

//ClassRoom Activity:
//1. Create 3 classes
//    - Mobile (methods: sendMsg, makeCall, saveContact),
//        AndroidPhone (takeVideo), SmartPhone (connectWhatsApp)
//    - AndroidPhone extends Mobile and SmartPhone extends AndroidPhone
//    - Create Object for SmartPhone and access all methods

public class Mobile {
	public void sendMessage() {
		System.out.println("I am sending message");
	}
	public void makeCall() {
		System.out.println("I am making call");
	}
	public void saveContact() {
		System.out.println("I am saving Contacts");
	}
}
