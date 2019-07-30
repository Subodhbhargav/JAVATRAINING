package inclassDemo;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    m1();
	}
    static void m1() {
    	try{
    		m2();
    	}
    	catch(Exception E) {
    		System.out.println("Caught");
    	}
    }
    static void m2() throws Exception{
    	m3();
    }
    static void m3() throws Exception{
    	int x = 5/0;
    
    		System.out.println("Caught");
    }
}
