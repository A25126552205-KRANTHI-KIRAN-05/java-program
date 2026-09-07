package single;

class Employe {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    // Default Constructor
    Employe() {
        name = "Unknown";
        id = 0;
        designation = "Not Assigned";
        salary = 0.0;
        promotionStatus = "Not Eligible";
    }

    // Parameterized Constructor
    Employe(String name, int id, String designation, double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + 
                           " | Designation: " + designation + 
                           " | Salary: " + salary + 
                           " | Promotion: " + promotionStatus);
    }

    public static void main(String[] args) {
        // Using Default Constructor
        Employe e1 = new Employe();
        e1.display();

        // Using Parameterized Constructor
        Employe e2 = new Employe("Kranthi Kiran", 101, "Developer", 50000, "Eligible");
        e2.display();
    }
}
