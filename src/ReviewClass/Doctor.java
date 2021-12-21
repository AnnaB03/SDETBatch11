package ReviewClass;

public class Doctor {
    //instance var
    String name;
    String lastName;
    String speciality;
    double salary;

//static var
    static String hospital;//belongs to the class

    //constructor
    Doctor (String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }
    //constructor
    public Doctor(String name, String lastName, String speciality) {
        this.name = name;
        this.lastName = lastName;
        this.speciality = speciality;
    }
    void treatPatient (String name) {
        System.out.println("Doctor " +this.name + " treats patient "+ name);

    }

    //instance var will work with inst and static
    void printInfo () {
        System.out.println(name +" "+ lastName+ " is a "+speciality);
    }
    void work() {
        System.out.println(name + " works at the hospital "+hospital);
    }
    void getPaid () {
        System.out.println(name +" "+ lastName+ " gets paid "+ salary);
    }
    //static method will only work with static variables
    static void companyName () {
        System.out.println("All doctors work at "+ hospital);
    }
}
