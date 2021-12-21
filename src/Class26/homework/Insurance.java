package Class26.homework;

public abstract class Insurance {
    /* Create a class Insurance that will have an attribute as insuranceName and unimplemented
behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
Car class has it's own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.*/

    String insuranceName;
    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public abstract void getQuote ();
    public abstract void cancelInsurance();

} class Car extends Insurance {
    String carModel;
    public Car (String carModel,String insuranceName) {
        super(insuranceName);
        this.carModel = carModel;
    }
    @Override
    public void getQuote() {
        System.out.println("get a quote for car model");
    }
    @Override
    public void cancelInsurance() {
        System.out.println("cancel the insurance for a car");
    }
} class Pet extends Insurance {
    String petType;
    public Pet (String petType, String insuranceName) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    public void getQuote() {
        System.out.println("get a quote for a pet type");
    }
    @Override
    public void cancelInsurance() {
        System.out.println("cancel the insurance for a pet");
    }
} class Health extends Insurance {
public Health (String insuranceName) {
    super(insuranceName);
}
    @Override
    public void getQuote() {
        System.out.println("get a quote for a health insurance");
    }
    @Override
    public void cancelInsurance() {
        System.out.println("cancel health insurance");
    }
}
