class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        int[] left = new int[n];
        int[] right = new int[n];
        int lsum = 0;
        int rsum = 0;
        for(int i=0;i<n;i++){
            lsum+=arr[i];
            left[i] = lsum;
        }
        for(int i=n-1;i>=0;i--){
            rsum+=arr[i];
            right[i] = rsum;
        }
        for(int i=0;i<n;i++){
            if(n == 1){
            return 1;
        }
            if(left[i]==right[i]){
                if(left[i-1] == right[i+1]){
                    return i+1;
                }
            }
        }
        // if(n == 1){
        //     return 1;
        // }
        return -1;
    }
}