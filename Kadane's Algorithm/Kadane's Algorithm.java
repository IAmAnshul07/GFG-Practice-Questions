class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        // Your code here
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            maxSum = Math.max(sum, maxSum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;   
    }   
}
