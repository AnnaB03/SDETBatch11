package Class23.Abstraction;

public class BMW extends Car{
    String make;
    String model;
    BMW(String vinNumber,String carType,String make,String model){
        super(carType, vinNumber);
        this.make=make;
        this.model=model;
        System.out.println("BMW Constructor");
    }
    @Override
    public void speed() {
        System.out.println("BMW can run 300Km/H");
    }

    @Override
    public void start() {
        System.out.println("BMW can start using remote");
    }
}
class Toyota extends Car{
    String make;
    String model;
    Toyota(String vinNumber,String carType,String make,String model){
        super(carType, vinNumber);
        this.make=make;
        this.model=model;

    }

    @Override
    public void speed() {
        System.out.println("Toyota can run 200Km/H");
    }

    @Override
    public void start() {
        System.out.println("Toyota can start using Keys");
    }
    void displayInfo(){
        System.out.println("we build "+make+" model "+model+" "+carType+
                " "+vinNumber);
    }
}