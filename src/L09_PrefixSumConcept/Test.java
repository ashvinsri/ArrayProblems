/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L09_PrefixSumConcept;
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
        int prefix_sum[]=new int[n];
        prefix_sum[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            prefix_sum[i]=prefix_sum[i-1]+arr[i];
        }
        int s=obj.nextInt();
        int e=obj.nextInt();
        if(s==0)
            System.out.println(prefix_sum[e]);
        else
            System.out.println(prefix_sum[e]-prefix_sum[s-1]);
    }
}