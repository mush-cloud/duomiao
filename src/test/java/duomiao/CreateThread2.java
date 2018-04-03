package duomiao;

public class CreateThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.err.println(Thread.currentThread().getName()+" i love you");
		
	}
}
