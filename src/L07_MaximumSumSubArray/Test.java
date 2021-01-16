/**
 *
 */
package L07_MaximumSumSubArray;
import java.util.*;
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
        int req=obj.nextInt();
        int i,flag=0;
        for(i=1;i<=n;i++)
        {
            int sum=0;
            for(int j=0;j<i;j++)
            {
                sum=sum+arr[j];
            }
            if(req==sum)
            {
                System.out.println("true");
                break;
            }
            for(int k=0;k<n-i;k++)
            {
                sum=sum-arr[k]+arr[k+i];
                    if(req==sum)
            {
                flag=1;
                System.out.println("true");
                break;
            }
                   
            }
             if(flag==1)
                        break;
        }
        if(i==n+1)
        {
            System.out.println("false");
        }
    }
}
