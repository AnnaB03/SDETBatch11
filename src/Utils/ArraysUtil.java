package Utils;

import java.util.ArrayList;

public class ArraysUtil {
    public static ArrayList<Integer> convertToArrayList(int[] arr){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int a:arr
        ) {
            arrayList.add(a);
        }
        return arrayList;
    }
}
