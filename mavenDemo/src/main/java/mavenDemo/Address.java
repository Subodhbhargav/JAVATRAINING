package mavenDemo;

public class Address {

	private String line1;
	private String line2;
	private String city;
	private String State;
	private String zipCode;
//	public Address(String line1, String line2, String city, String state, String zipCode) {
//		super();
//		this.line1 = line1;
//		this.line2 = line2;
//		this.city = city;
//		State = state;
//		this.zipCode = zipCode;
//	}
	
	
	public String getLine1() {
		return line1;
	}
	public Address() {
	
}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "line1:" + line1 + "\n line2:" + line2 + "\n city:" + city + "\n State:" + State + "\n zipCode:"
				+ zipCode;
	}
	
	
	
}
