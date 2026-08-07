package ARRAYLIST;
import java.util.*;
public class Lonely_number {
    public static boolean is_present_once(ArrayList<Integer> arr1,int key)
    {
        int check=0;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i)==key) {
                check++;
                if (check==2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean check_adjacent_numbers(ArrayList<Integer> arr1,int key)
    {
       return !arr1.contains(key+1) && !arr1.contains(key-1);
    }
    public static ArrayList<Integer> solution_(ArrayList<Integer> arr1){

        ArrayList<Integer> newArrayList=new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) {
            if (is_present_once(arr1, arr1.get(i)) && check_adjacent_numbers(arr1, arr1.get(i))) {
                newArrayList.add(arr1.get(i));
            }
        }
        return newArrayList;
    }
    public static void main(String[] args) {
        
    }
}
