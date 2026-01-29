public class FibonacciSequence
{
	public static void main(String[] args)
	{
		int fnm2 = 1;
		int fnm1 = 1;
		int sum=fnm2+fnm1;
		int i;
		System.out.print(fnm2+" ");
		System.out.print(fnm1+" ");
		for(i=1;i<=18;i++)
		{
			int fn=fnm2+fnm1;
			System.out.print(fn+", ");
			sum += fn;
			fnm2=fnm1;
			fnm1=fn;
		}
		System.out.println();
		double average = (double) sum / 20;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
	}
}
