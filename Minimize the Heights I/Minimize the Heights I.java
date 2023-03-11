class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int minimum, maximum;
        int result = arr[n-1]-arr[0];
        for(int i=1; i<n; i++){
            maximum = Math.max(arr[i-1]+k,arr[n-1]-k);
            minimum = Math.min(arr[0]+k, arr[i]-k);
            result = Math.min(result, maximum-minimum);
        }
    return result;
    }
}