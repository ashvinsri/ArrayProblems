/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L03_RotateArray;
import java.util.*;
/**
 * Write a  java program to rotate an array 
 * a[]={1,2,3,4,5}
 * d=2;
 * a[]={3,4,5,1,2}
 * {2,1,3,4,5} REVERSE(ARR,0,D-1);
 * (2,1,5,4,3} REVERSE(ARR,D,N-1);
 * (3,4,5,1,2} REVERSE(ARR,0,N-1);
 */
public class Test {
    static void reverse(int arr[],int s,int e)
    {
        int low=s,high=e;
        while(low<high)
        {
           arr[low]=arr[low]+arr[high];
           arr[high]=arr[low]-arr[high];
           arr[low]=arr[low]-arr[high];
           low++;
           high--;
        }
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int d=obj.nextInt();
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
         for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
