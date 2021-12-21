package Class25.TasksProject;

public class MarksUtil {
    static double change(double value, int decimalpoint)
    {

        // Using the pow() method
        value = value * Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);

        System.out.println(value);

        return value;
    }
}
