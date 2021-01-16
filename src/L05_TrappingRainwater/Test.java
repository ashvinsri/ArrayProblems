/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L05_TrappingRainwater;
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
        int lmax[]=new int[n];
        lmax[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>lmax[i-1])
            {
                lmax[i]=arr[i];
            }
            else
            {
                lmax[i]=lmax[i-1];
            }
        }
        int rmax[]=new int[n];
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>rmax[i+1])
            {
                rmax[i]=arr[i];
            }
            else
            {
                rmax[i]=rmax[i+1];
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int val=Math.min(lmax[i],rmax[i]);
            sum+=(val-arr[i]);
        }
        System.out.println("Total water storage="+sum+" units");
    }
}
