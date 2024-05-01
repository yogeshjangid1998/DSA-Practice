import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class GFG {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in); 
        // int t = sc.nextInt();
        // while(t-- > 0)
        // {
        //     int n = sc.nextInt();
        //     int a[] = new int[n];
            
        //     for(int i=0;i<n;i++){
        //         a[i] = sc.nextInt();
        //     }
            
            Solution obj = new Solution();
            
        //     System.out.println(obj.Maximize(a,n));
        // }

        // sc.close();

        int[] arr = {7, 10, 4, 20,15};
        int[] arr2 = {7, 10, 4, 3, 20, 15};

        obj.kthMaxle(arr2, 3);
    }
    
}

class Solution{
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        // int i = 0;
        // return Arrays.stream(arr).sorted().map(j -> j*i++).sum();
        Arrays.sort(arr);
        long sum = 0;
        for(int i = 0; i< n; i++){
            sum += (long) arr[i] * (long) i;
        }
        // System.out.println(sum);
        return (int) sum%1000000007;
    } 

    public int kthMaxle(int[] arr, int k){
        Queue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
        }

        // System.out.println(q.poll());
        // System.out.println(q.poll());
        // System.out.println(q.poll());
        return 0;
    }
}
