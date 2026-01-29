import java.util.*;
class Main2
{
public static void main(String[] args)
{
Set<Integer>i= new HashSet<Integer>();
i.add(2);
i.add(1);
i.add(5);
System.out.println(i);
System.out.println(i.contains(2));
System.out.println(i.contains(4));
}
}