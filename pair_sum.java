package ARRAYLIST;

public class pair_sum {
    public static boolean solution(int array[],int target){
        int i=0;
        int j=array.length-1;

        while (i<j) {
            if (array[i]+array[j]==target) {
                return true;
            }
            if (array[i]+array[j]<target) {
                i++;
            }
            if (array[i]+array[j]>target) {
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
