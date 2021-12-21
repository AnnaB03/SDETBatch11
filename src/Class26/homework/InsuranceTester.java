package Class26.homework;

import java.util.ArrayList;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList <Insurance> insuranceArrayList = new ArrayList<>();
        insuranceArrayList.add(new Car("Tesla", "Geico"));
        insuranceArrayList.add(new Pet("Dog", "Geico"));
        insuranceArrayList.add(new Health("Healthfirst"));

        for (Insurance ins : insuranceArrayList) {
            ins.getQuote();
            ins.cancelInsurance();

        }

    }
}
