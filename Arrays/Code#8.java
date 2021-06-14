class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int max = Integer.MIN_VALUE,current=0;
        for(int i: arr){
            current += i;
            if(current>=max) max = current;
            if(current<0) current=0;
        }
        return max;
    }
    
}
