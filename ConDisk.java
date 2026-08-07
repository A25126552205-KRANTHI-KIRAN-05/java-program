package javacore;

public class ConDisk {
    
	void size() {
		System.out.println("this the samle space");
	}
	void sample () {
		System.err.println("another method");
	}
	
	
	public static void main(String[] args) {
		ConDisk k = new ConDisk();
		k.size();
		k.sample();
	}
}
