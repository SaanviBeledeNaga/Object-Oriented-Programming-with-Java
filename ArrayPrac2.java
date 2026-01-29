public class ArrayPrac2
{
	public static void main(String[] args)
	{
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;
		double average = 0.0;
		int[] myarr = {1,2,3,4,5};
		for(int i=0;i<myarr.length;i++)
		{
			sum += myarr[i];
			average = sum/myarr.length;
			if(myarr[i]%2==0)
			{
				evensum += myarr[i];
			}
			else
			{
				oddsum +=myarr[i];
			}
		}
		System.out.println("The odd sum is: "+oddsum);
		System.out.println("The even sum is: "+evensum);
		System.out.println("The sum is: "+sum);
		System.out.println("The average is: "+average);
	}
}
			
			