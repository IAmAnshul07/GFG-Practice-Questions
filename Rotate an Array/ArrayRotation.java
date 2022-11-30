class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void Reverse(int arr[], int start, int end)
    {
        int temp;
        // int start=0, end=n-1;
       
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotateArr(int arr[], int d, int n){
        d = d%n;
        Reverse(arr,0,d-1);
        Reverse(arr,d,n-1);
        Reverse(arr,0,n-1);
    }
}