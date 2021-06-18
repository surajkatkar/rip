public class ThreadDemo
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread "+i);
		}
	}
}

class MyThread extends Thread
{
	public void run()
	{
		//System.out.println(Thread.getName());
		for (int i=0;i<10;i++)
		{
			System.out.println("Child thread "+i);
		}
	
	}
}

class 