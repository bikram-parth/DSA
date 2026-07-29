package DSA.Arrays;
import java.util.*;
public class subarray_sum {
    public static int solution(int array[],int target)
    {
      int prefix_sum[]=new int[array.length];
      
      //store all the prefix sum 
      prefix_sum[0]=array[0];
      for (int i = 1; i < prefix_sum.length; i++) {
        prefix_sum[i]=prefix_sum[i-1]+array[i];
      }

      HashMap<Integer,Integer> hm=new HashMap<>();

      hm.put(0, 1);
      int count=0;

      for(int i = 0 ; i < prefix_sum.length ;i++)
      {
           if(hm.containsKey(prefix_sum[i]-target))
           {
            int value=hm.get(prefix_sum[i]-target);
            count+=value;
           }
        
        if(!hm.containsKey(prefix_sum[i]))
        {
            hm.put(prefix_sum[i], 1);
        }
        else
        {
            int value=hm.get(prefix_sum[i]);
            hm.remove(prefix_sum[i]);
            hm.put(prefix_sum[i], value+1);
        }
           
      }
      return count;
    }
    public static void main(String[] args) {
         //cd path/to/folder
        //git clone https://github.com/username/repository.git
        //cd repository
        //# Add or modify files
        //git status
        //git add .
        //git commit -m "Your commit message"
        //git push origin main
    }
}
