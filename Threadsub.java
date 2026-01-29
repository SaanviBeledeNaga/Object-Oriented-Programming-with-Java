class Threadsub extends Thread
{
	public static void main(String[] args)
	{	
		Threadsub t1 = new Threadsub();
		t1.start();
		System.out.println("iam inside a main method");
	}
	public void run()
	{
	System.out.println("iam inside a thread");
	}
}

