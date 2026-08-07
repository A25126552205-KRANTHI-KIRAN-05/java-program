package abstractclases;

abstract class Sample{
	int x = 10;
	void demo() {
		System.out.println("this is from demo");
	}
	abstract void gallery();
}
class Multi extends Sample{
	void show() {
		System.out.println("this is from show");
	}
	@Override
	void gallery() {
		System.out.println("this is from gallery");
	}
}
public class IncompleteClasses {
public static void main(String[] args) {
	Multi ml = new Multi();
	System.out.println(ml.x);
	ml.demo();
	ml.gallery();
}
}
