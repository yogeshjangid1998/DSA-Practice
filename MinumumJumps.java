package Arrays.Medium;

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinumumJumps
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Jumps().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

//Algorithm

/**
 * MinumumJumps
 * 
 * 1. First Sort both arrays (because We only need arrival and departure time)
 *
 * 2. we will iterate in first array from index 1 and compare it with second array 0th index.
 * 
 * 3. if current start Time <= depart time then we need one platform. because platform is occupied with previous train.
 *      and its not left yet.
 *      a. we will increase plat++ and comapre that with current max.
 * 
 * 4. else the previous train will left and one paltform will be empty and we will assign current train to that platform.
 * 
 */


class Jumps
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr); Arrays.sort(dep);
        int max = 1, plat = 1, i = 1, j = 0;
        
        while(i < n){
            if(arr[i] <= dep[j]){
                plat++;
                max = Math.max(max, plat);
                i++;
            }else{
                plat--;
                j++;
            }
            
        }
        
        
        // System.out.println(Arrays.toString(maxArr));
        // System.out.println(Arrays.toString(maxDep));
        return max;
    }
    
}


