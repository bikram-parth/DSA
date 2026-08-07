package ARRAYLIST;
import java.util.*;
public class reverse {
    
    public static void reverse_(ArrayList<Integer> arr1,int starting,int ending)
    {
        int st=0;
        int end=arr1.size()-1;
        while (st<end) {
            int temp=arr1.get(st);
            int temp1=arr1.get(end);
            arr1.set(end,temp);
            arr1.set(st, temp1);
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        
    }
}
