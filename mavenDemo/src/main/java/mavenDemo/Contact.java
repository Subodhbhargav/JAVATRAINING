package mavenDemo;

public class Contact {
  private String email;
  private String phoneNumber;
//public Contact(String email, String phoneNumber) {
//	super();
//	this.email = email;
//	this.phoneNumber = phoneNumber;
//}
  
  

public Contact() {
	
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Override
public String toString() {
	return "email:" + email + "\n phoneNumber:" + phoneNumber;
}
  

}
