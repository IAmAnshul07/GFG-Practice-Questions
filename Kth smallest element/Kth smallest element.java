class Solution{
    public static int kthSmallest(int[] arr, int low, int high, int k) 
    { 
        Arrays.sort(arr);
        return (arr[k-1]);
    } 
}
