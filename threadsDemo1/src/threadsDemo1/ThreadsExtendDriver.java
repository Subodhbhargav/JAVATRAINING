package threadsDemo1;

public class ThreadsExtendDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name = Thread.currentThread().getName();
        System.out.println("Main=" + name);
        
        ThreadsExtend m1 = new ThreadsExtend();
        m1.setName("user1");
        ThreadsExtend m2 = new ThreadsExtend();
        m2.setName("user2");
        
        m1.start();
        m2.start();
	}

}
 