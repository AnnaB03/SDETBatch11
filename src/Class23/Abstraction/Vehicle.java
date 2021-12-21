package Class23.Abstraction;

public abstract class Vehicle {
    // abstract String vin_number; abstract not allowed with fields
    String vinNumber;
    static int totalVehicles;
    /* abstract Vehicle(){
         abstract not allowed with constructors
     }*/
    Vehicle(String vinNumber){
        totalVehicles++;
        this.vinNumber=vinNumber;
        System.out.println("Grandpas constructor is called");
    }
    public void printVehicleCount(){
        System.out.println(totalVehicles+
                " Vehicle creating");
    }
    public void drive(){
        System.out.println("Vehicle is driving ");
    }
    public void stop(){
        System.out.println("Vehicle stopping");
    }
    public abstract void start();
}

abstract class  Car extends Vehicle{
    String carType;
    Car(String carType,String vinNumber){
        super(vinNumber);
        this.carType=carType;
        System.out.println("Parent constructor is called");
    }
    public void drive(){
        System.out.println("Car is driving ");
    }
    public abstract void speed();
}