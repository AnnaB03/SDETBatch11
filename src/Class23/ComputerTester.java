package Class23;

public class ComputerTester {

    public static void main(String[] args) {
        Computer []computers={new Apple("Apple"),new Lenovo("Lenovo"),
                new HP("HP"),new Dell("Dell")};


        //break till 11:40
        for (Computer computer2:computers){
            computer2.printOperatingSystem();

            if (computer2 instanceof Apple){
                ((Apple)computer2).printCost();
            }
            if (computer2 instanceof Lenovo){
                ((Lenovo)computer2).printLaptops();
            }
            if (computer2 instanceof HP){
                ((HP)computer2).printBrand();
            }
            if (computer2 instanceof Dell){
                ((Dell)computer2).printServices();
            }
        }
    }


}