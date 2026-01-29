class A extends Thread
{
    @Override
     public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("JAVA");
        }
    }
}
class B extends Thread
{
    @Override
     public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("HELLO");
        }
    }
}
class Demo
{
    public static void main(String[] args) 
    {
        A a1=new A();
        B b1=new B();
        a1.start();
        b1.start(); 
    }
}