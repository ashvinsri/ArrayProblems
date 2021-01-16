/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L01_ArrayInsertion;
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
        int arr[]=new int[n+2];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int num=obj.nextInt();
        int pos=obj.nextInt();
        for(int i=n-1;i>=pos-1;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[pos-1]=num;
        n++;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Deletion");
        
        System.out.println("Deleted element is="+arr[pos-1]);
        for(int i=pos;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        n--;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
