package Arrays.Medium;//{ Driver Code Starts
//Initial Template for Java - https://www.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1?page=1&category=Arrays&difficulty=Easy&sprint=94ade6723438d94ecf0c00c3937dad55&sortBy=submissions

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LongestCommonPrefixInAnArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution2 ob = new Solution2();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution2{
    String longestCommonPrefix(String arr[], int n){

        // optimized answer
        String result = "";
        int length = 0;
        
        while(length < arr[0].length()){
            boolean found = true;
            char c = arr[0].charAt(length);
            for(int i = 1; i < n; i++){
                if(length >= arr[i].length()){
                    found = false;
                    break;
                }
                if(arr[i].charAt(length) != c){
                    found = false;
                    break;
                }      
            }
            if(found) 
                result += c;
            else 
                break;
            
            length++;
        }

        // return result.length()>0 ? result : "-1";
        
        
        
        // code here
        // String smallest = ""; int length = Integer.MAX_VALUE;
        
        // for(int i = 0; i< n; i++){
        //     if(arr[i].length() < length) 
        //         smallest = arr[i];
        //         length = arr[i].length();
        // }
        // length = smallest.length();
        
        // while(length > 0){
        //     boolean found = true; int count = 0;
        //     String mid = smallest.substring(0, length);
        //     for(int i = 0; i < n; i++){
        //         if(arr[i].equalsIgnoreCase(mid)) {
        //             count++;
        //             continue;
        //         } 
        //         if(!arr[i].startsWith(mid)){
        //             found = false;
        //             break;
        //         }
        //     }
        //     if(found || count == n) return mid;
        //     length--;
        // }

         return "-1";
    }
}