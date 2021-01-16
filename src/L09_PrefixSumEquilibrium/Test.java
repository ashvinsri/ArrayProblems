/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L09_PrefixSumEquilibrium;
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
        int prefix_left[]=new int[n];
        prefix_left[0]=arr[0];
        int prefix_right[]=new int[n];
        prefix_right[n-1]=arr[n-1];
        for(int i=1;i<n;i++)
        {
            prefix_left[i]=prefix_left[i-1]+arr[i];
            prefix_right[n-1-i]=prefix_right[n-i]+arr[n-1-i];
        }
        int i;
        for(i=0;i<n;i++)
        {
            if(prefix_left[i]==prefix_right[i])           // O(n) time complexity  O(n) space complexity 
            {
                System.out.println(i+1);
                break;
            }
        }
        if(i==n)
            System.out.println("No Equilibrium Point");
    }
}
class A {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int i=0;
        int left_sum=0;
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        int j;
        left_sum=0;
        for(j=0;j<n;j++)
        {
            
            if(left_sum==sum-arr[j])
            {
                System.out.println("Equilibrium Point="+(j+1));
                break;
            }
            left_sum+=arr[j];
            sum=sum-arr[j];
        }
        if(j==n)
            System.out.println("No Equilibrium Point");
    }
}
