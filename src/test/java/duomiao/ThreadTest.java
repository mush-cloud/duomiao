package duomiao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Reader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {
	public volatile static int i = 0;
	/*public static class AddThread extends Thread
	{
		@Override
		public void run()
		{
			for (i = 0; i < 10000000; i++){
			System.out.println("add");
			}
		}
	}
	public static void main(String[] args) throws InterruptedException{//主线程
		AddThread add = new AddThread();
		 Thread thread = new Thread(){
			 @Override
			 public void run(){
				 System.out.println(Thread.currentThread().getName()+"sss");
				 for (i = 0; i < 10000000; i++)
						;
			 }
	
		 };
		 thread.start();
		add.setDaemon(true);
		add.start();
		synchronized(add) {
		add.wait(0);//当前线程进入等待队列		
		synchronized(add) {
			add.notify();
			}
		}
		System.err.println(i);
	}*/
	public static class DaemonThread extends Thread
	{
		@Override
		public void run()
		{
			for (int i = 0; i < 10000000; i++)
			{
				System.out.println("hi");
			}
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		try {
			FileReader reader = new FileReader("ok");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         int c = -4;
         int t = c>>2;
         System.err.println(t);
		int[] a = new int[5];
		String x = "123";
		int s = 123;
		if(s == Integer.parseInt(x)){System.err.println(s);}
	    int d = 2;
		/*BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);
		bq.put(1k);
		Lock lock = new ReentrantLock();
		 PipedInputStream pis = new PipedInputStream();//同步方法 ，管道，读
		 PipedOutputStream pos = new PipedOutputStream();//写
		 try {
			pis.connect(pos);//形成管道通信
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Condition nullFull = lock.newCondition();
		DaemonThread dt = new DaemonThread();
		dt.setDaemon(true);
		dt.start();
		Semaphore  s = new Semaphore(1);*/
		
	}
}

