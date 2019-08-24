package mavenDemo;

public class Name {

private String firstName;
private String lastName;


//public Name(String firstName, String lastName) {
//	super();
//	this.firstName = firstName;
//	this.lastName = lastName;
//}
public Name() {
	
}	
	
public String getFirstNmae() {
	return firstName;
}
public void setFirstNmae(String firstNmae) {
	this.firstName = firstNmae;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
public String toString() {
	return "firstName:" + firstName + "\n, lastName:" + lastName ;
}


}
