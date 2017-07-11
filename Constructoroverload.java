
public class Constructoroverload
{
public static void main(String[] args)
{
	Demo3 mydemo=new Demo3(10,20,30);
	Demo3 mydemo1=new Demo3();
	Demo3 mydemo2=new Demo3(10);
	
double vol;
vol=mydemo.volume();
	System.out.println("values" +vol );	
vol=mydemo1.volume();
System.out.println("values" +vol );
vol=mydemo2.volume();
System.out.println("values" +vol );
	
		
	
	
}
}
