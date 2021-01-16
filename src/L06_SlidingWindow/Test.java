/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L06_SlidingWindow;
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
        {
            arr[i]=obj.nextInt();
        }
        int k=obj.nextInt();
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int min=sum;
        for(int i=0;i<n-k;i++)
        {
            sum=sum-arr[i]+arr[i+k];
            if(sum>min)
                min=sum;
        }
        System.out.println("Sum="+min);
    }
}
