/**
 * Reverse an Array using Extra Variable
 * 
 */
package L02_ReverseArray;
import java.util.*;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=obj.nextInt();
        int l=0;int h=n-1;
       while(l<h)
       {
           arr[l]=arr[l]+arr[h];
           arr[h]=arr[l]-arr[h];
           arr[l]=arr[l]-arr[h];
           l++;
           h--;
       }
       for(int i=0;i<n;i++)
           System.out.print(arr[i]+" ");
    }
}
