class Solution {
    int binarysearch(int arr[], int n, int k) {
        int start=0;
        int end = n-1;
        int mid = (start + end)/2;
        while(start <= end){
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]<k){
                start = mid+1;
            }else{
                end = mid-1;
            }mid = (start + end)/2;
        }
        return -1;
}
}