package myThread;

public class InterruptTest {
	public static void main(String[] args) {
		MyTest mytest = new MyTest();
		try {
			mytest.start();
			mytest.sleep(20);
			mytest.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end!!!!!");
	}
}

class MyTest extends Thread{

	@Override
	public void run() {
		super.run();
		for(int i=0;i<5000;i++) {
			if(this.interrupted()) {
				System.out.println("已经是退出状态了");
				break;
			}
			System.out.println("i=" +(i+1));
		}
	}
	
}
