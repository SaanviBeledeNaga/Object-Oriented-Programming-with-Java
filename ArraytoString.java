import java.util.Arrays;
public class ArraytoString
{
	public static void main(String[] args)
	{
		int[]n = {15,1,22,2,3,4,-1};
		int[]x = {12,25,35,46,59};
		Arrays.sort(n);
		//Arrays.fill(n,10);
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.equals(n,x));
	}  		
}