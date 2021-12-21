package Class23;

public class Computer {
    /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of
    the methods in child classes
     Define some methods specific to child classes
            Create objects of child classes and store them into array.
            Loop through each object and execute available methods.*/
    String model;
    Computer(String model){
        this.model=model;
    }
    void printOperatingSystem(){
        System.out.println(model+" Has operating system");
    }
    void playVideo(){
        System.out.println("Can play videos");
    }
}
class Apple extends Computer{
    Apple(String model){
        super(model);
    }

    @Override
    void printOperatingSystem() {
        System.out.println(model+ " has MacOS");
    }
    void printCost(){
        System.out.println("Normally apple computer products cost more");
    }
}
class Lenovo extends Computer{
    Lenovo(String model){
        super(model);
    }
    @Override
    void printOperatingSystem() {
        System.out.println(model+ " has Windows");
    }

    void printLaptops(){
        System.out.println("Lenovo has a wide selection of laptops");
    }
}
class HP extends Computer{
    HP(String model){
        super(model);
    }
    @Override
    void printOperatingSystem() {
        System.out.println(model+ " has Linux");
    }
    void printBrand(){
        System.out.println(model+" is well respected brand in the Pc and Laptop markets");
    }
}

class Dell extends Computer{
    Dell(String model){
        super(model);
    }

    @Override
    void printOperatingSystem() {
        System.out.println(model+" uses Windows 10");
    }
    void printServices(){
        System.out.println(model+" has good reputation of their products and services");
    }}