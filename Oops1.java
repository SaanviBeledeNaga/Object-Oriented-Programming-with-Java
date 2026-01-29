class Encapsulation //private access given to this particular class.
{
	private String name = "Kutti";
	private int rollNo = 67;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setrollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public String getName()
	{
		return name;
	}
	public int getrollNo()
	{
		return rollNo;
	}
}
class Oops1 
{
			public static void main(String[] args)
			{
			Encapsulation en = new Encapsulation();
			//en.name = "Encap";
			//System.out.println(en.name);
			//en.setName("Principle of OOP");
			//en.setrollNo(67);
			System.out.println(en.getName());
			System.out.println(en.getrollNo());
			}
}
