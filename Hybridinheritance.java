class Skill
{
	void hobby()
	{
		System.out.println("I have a hobby");
	}
}
class Skill1 extends Skill 
{
	void dance()
	{
		System.out.println("My hobby is dance");
	}
}
class Skill2 extends Skill1
{
	void classicaldance()
	{
		System.out.println("It is classical dance");
	}
}
class Skill3 extends Skill1
{
	void westerndance()
	{ 
		System.out.println("It is western dance");
	}
}
class Hybridinheritance
{
	public static void main(String[] args)
	{
		Skill1 hb = new Skill1();
		Skill2 cs = new Skill2();
		Skill3 ws = new Skill3();
		cs.hobby();
		cs.dance();
		cs.classicaldance();
		ws.hobby();
		ws.dance();
		ws.westerndance();
	}
}
		