
public class Demo3 {
	double width;
	double length;
	double height;
Demo3(double w,double l,double h)
{
w=width;
h=height;
l=length;

}
Demo3()
{
width=-1;
length=-1;
height=-1;
}
Demo3(double len)
{
	length=width=height=len;
}
double volume()
{
return length*width*height;
}
}



