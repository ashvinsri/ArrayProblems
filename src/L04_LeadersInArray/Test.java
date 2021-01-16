/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L04_LeadersInArray;
import java.util.*;
/**
 *An element of array is said to be leader if there is no greater element present in right side of it
 * I/P= {5,3,20,15,8,3}
 * O/P= 3,8,15,20
 */
public class Test {
    public static void main(String args[])
    {
       Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
           arr[i]=obj.nextInt();
       int max=-99;
       for(int i=n-1;i>=0;i--)
       {
           if(arr[i]>max)
           {
               System.out.print(arr[i]+" ");
               max=arr[i];
           }
       }
    }
}
