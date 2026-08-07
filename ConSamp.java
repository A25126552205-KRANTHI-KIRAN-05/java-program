package javacore;

public class ConSamp {
	int RollNo;
	String name;
	float fee;
	
	//constructor
	public ConSamp(int i,String n,Float F) {
		this.RollNo = i;
		this.name = n;
		this.fee = F;
	}	
    void main() {
    	System.out.println("Roll No"+ this.RollNo );
		System.out.println("name"+ this.name);
		System.out.println("fee"+ this.fee);
		}
    public static void main(String[] args) {
    	ConSamp t = new ConSamp(45,"Suresh",456.87f);
    	t.main();
    }
}
