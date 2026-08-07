package javacore;

public class Demo {
	int RollNo;
	String name;
	float fee;
	
	//constructor
	public Demo() {
		this.RollNo = 2345;
		this.name = "Suresh";
		this.fee = 257.876f;
	}	
    void main() {
    	System.out.println("Roll No"+ this.RollNo );
		System.out.println("name"+ this.name);
		System.out.println("fee"+ this.fee);
		}
    public static void main(String[] args) {
    	Demo bt = new Demo();
    	bt.main();
	}
}
