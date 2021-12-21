package ReviewClass;

public class Hospital {
    public static void main(String[] args) {

    Doctor d1 = new Doctor("John","Doe", 10000);
    Doctor.hospital = "Inova";
    d1.work();
    d1.printInfo();
        System.out.println("3");
        Doctor d2 = new Doctor("Jane","Smith","cardiologist");
        d2.work();
        d2.printInfo();
//        d2.name = "Jane";
//        d2.lastName = "Smith";
//        d2.speciality = "Cardiologist";
//        d2.work();
//        d2.name = "Bond";
        d2.hospital = "JW Hospital"; //shares memory - will affect all instances

        System.out.println();
        d1.work();
        d2.work();

        //accessing static method
        Doctor.companyName();

        d1.treatPatient("James");
        d2.treatPatient("Anna");

}
}