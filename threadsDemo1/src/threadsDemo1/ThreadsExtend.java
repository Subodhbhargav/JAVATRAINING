package threadsDemo1;

public class ThreadsExtend extends Thread {
	public void run() {
			String name = Thread.currentThread().getName();
			if(name.equals("user1")) {
				m1();
			}
			else {
				m2();
			}
	}
	
	public void m1() {
		String name = Thread.currentThread().getName();
		System.out.println("m1=" + name);
		System.out.println("waited");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("caught");
		}
 
	}
	public void m2() {
		String name = Thread.currentThread().getName();
		System.out.println("m2=" + name);
		System.out.println("waited");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("caught");
		}

	}
	

}
