package ARRAYLIST;

public class pair_sum2 {
    public static boolean solution(int array[],int st,int end,int key)
    {
        int mid=st+(end-st)/2;

        while (st<end) {
            if (array[mid]==key) {
                return true;
            }
            else if (array[mid]<key) {
                st=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return false;
    }
    
    public static int search_in_a_rotated_sorted_array(int array[],int st,int low,int key)
    {
        int mid=st+(low-st)/2;

        while (st<low) {
            if (array[mid]==key) {
                return mid;
            }
            if (array[st]<array[mid]) {//my left part is sorted
                if (key>=array[st] && key<array[mid]) {
                    low=mid-1;
                }
                else
                {
                    st=mid+1;
                }
            }
            else//my right part is sorted
            {
                if (key>array[mid] && key<=array[low]) {
                    st=mid+1;
                }
                else
                {
                   low=mid-1;
                }
            }
        }
        return mid;
    }
    
    public static boolean pair_sum_sol(int array[],int key)
    {
        int i=0;
        int j=0;
        for (int index = 0; index < array.length-1; index++) {
            if (array[index]>array[index+1]) {
                j=index;
                i=index+1;
                break;
            }
        }

        while (i!=j) {
            if (array[i]+array[j]==key) {
                return true;
            }
            else if (array[i]+array[j]>key) {
                i=(i+1)%array.length;
            }
            else{
                j=(array.length+j-1)%array.length;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
