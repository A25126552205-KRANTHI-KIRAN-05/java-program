package javacore;

public class Constructor {
	int RollNo;
	String name;
	float fee;
	
	//constructor
	public Constructor  () {
		RollNo = 2345;
		name = "Suresh";
		fee = 257.876f;
	}	
    void main() {
    	System.out.println("Roll No"+ RollNo );
		System.out.println("name"+ name);
		System.out.println("fee"+ fee);
		}
    public static void main(String[] args) {
    	Constructor bt = new Constructor ();
    	bt.main();
	}
}
