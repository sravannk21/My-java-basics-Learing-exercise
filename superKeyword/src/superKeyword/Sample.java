package superKeyword;

public class Sample extends parentClass {
public static void main(String ar[]) {
	Sample obj=new Sample();
	obj.display();
}
void display(){
	super.display();
	System.out.println("hello world");
}
Sample(){
	System.out.println("this is base class constructor");
}
}