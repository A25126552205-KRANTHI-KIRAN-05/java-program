package single;
interface riya{
	 int x=10;
	void siva();
}
//interface extends interface
interface raji extends riya {
	int z=15;
	void lucky();
}
//class extends interfaces
class Raghu implements riya, raji{
	@Override
	 public void siva() {
		System.out.println("i am siva");
	}
	@Override
	public void lucky() {
		System.out.println("i am lucky");
	}
}
public class Interfaces {
	public static void main(String[] args) {
		Raghu r=new Raghu();
		r.siva();
		r.lucky();
	}
}