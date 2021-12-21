package ReviewClass;

public class Community {
    public static void main(String[] args) {
        House house1 = new House(); //house1. is a variable of a non-primitive type,
        //we can create thousands non-primitive types
        house1.area = 2000;
        house1.color = "grey";
        house1.rooms = 4;

        // house1.bathroom =2; cannot be resolved, there's no such field
        // house1.watch(); is undefined for the type House
        House house2 = new House();
        house2.area = 2000;
        house2.color = "grey";
        house2.rooms = 4;
    }

}
