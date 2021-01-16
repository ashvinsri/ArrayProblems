/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L08_CountDistinctValues;
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
        int k=obj.nextInt();
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<k;i++)
        {
            if(!mp.containsKey(arr[i]))
                mp.put(arr[i], 1);
            else
                mp.put(arr[i],mp.get(arr[i])+1);
                
        }
        System.out.print(mp.size()+" ");
        for(int i=0;i<n-k;i++)
        {
            if(mp.get(arr[i])==1)
            {
                mp.remove(arr[i]);
            }
            else
            {
                mp.put(arr[i], (mp.get(arr[i])-1));
            }
            if(mp.containsKey(arr[i+k]))
            {
                mp.put(arr[i+k], (mp.get(arr[i+k])+1));
            }
            else
            {
                mp.put(arr[i+k], 1);
            }
            System.out.print(mp.size()+" ");
        }
    }
}
