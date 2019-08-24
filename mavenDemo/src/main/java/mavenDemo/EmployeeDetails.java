package mavenDemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e=new Employee();
		Address a=new Address();
		Name n = new Name();
		Contact c = new Contact();
		a.setLine1("horizons");
	    a.setLine2("apt 108");
		a.setCity("Maryville");
		a.setState("missouri");
		a.setZipCode("64468");
		
		n.setFirstNmae("Subodh");
		n.setLastName("Lakhinana");
		
		c.setEmail("Subodhbhargav20@gmail.com");
		c.setPhoneNumber("8734567347");
		
		e.setEmpID("647");
		e.setEmpStatus("workig");
		e.setN(n);
		e.setA(a);
		e.setC(c);
		
		System.out.println(e);
		System.out.println(".................");
		
		ObjectMapper mapper = new ObjectMapper();
		String json;
		try {
			json = mapper.writeValueAsString(e);
			System.out.println(json);
			
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		
	}

}
