package abstractclases;

interface I1 {
	int x = 25;
	void empty();
}
interface I2{
	int y = 50;
	void complete();
}
class Colour implements I1,I2{
	@Override
	public void empty() {
		System.out.println("this from empty");
	}
	@Override
	public void complete(){
		System.out.println("this is from complete");
	}
	void many() {
		System.out.println("this is from many");
	}
}
public class Interface {
	public static void main(String[] args) {
		Colour cl = new Colour();
		System.out.println(I1.x);
		System.out.println(I2.y);
		System.out.println("the sum of x and y is "+(I1.x+I2.y));
		cl.complete();
		cl.empty();
		cl.many(); 
	}
}
