package single;

class Human{
	void eat() {
		System.out.println("Human is eating");
	}
}
class Noise extends Human{
	void sound() {
	System.out.println("Animal is barking");
  }
}
public class Demo {
public static void main(String[] args) {
	Noise n = new Noise();
	n.eat();
	n.sound();
}
}

