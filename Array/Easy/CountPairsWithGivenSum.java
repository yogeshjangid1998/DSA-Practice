//{ Driver Code Starts
//Initial Template for Java ->https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?page=1&category=Arrays&difficulty=Easy&sprint=94ade6723438d94ecf0c00c3937dad55&sortBy=submissions

import java.io.*;
import java.util.*;

public class CountPairsWithGivenSum {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count = 0;
        
        // new answer
        for(int i = 0; i< arr.length; i++){
            int need = k - arr[i];
            if(hmap.containsKey(need))
                count += hmap.get(need);
            
            if(hmap.containsKey(arr[i]))
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            else
                hmap.put(arr[i], 1);
        }
        
        return count;
        
        
        //my previous answer
        
        // for(int i = 0; i< arr.length; i++){
        //     if(hmap.containsKey(arr[i]))
        //         hmap.put(arr[i], hmap.get(arr[i])+1);
        //     else
        //         hmap.put(arr[i], 1);
        // }
        
        // System.out.println(hmap);
        
        // for(int i = 0; i < arr.length; i++){
        //     int need = k - arr[i];
        //     if(hmap.containsKey(need) && need != arr[i])
        //         count += hmap.get(need);
        //     else if(hmap.containsKey(need))
        //         count += hmap.get(need)-1;
            
        //     hmap.put(arr[i], hmap.get(arr[i]) - 1);
            // System.out.println(hmap);
            // if(hmap.get(arr[i]) == 0) hmap.remove(arr[i]);
        // }
        
        // return count;
    }
}
