class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int start=0; 
        int mid = 0;
        int end = n-1;
        int temp;
        while(mid <=end){
            if(a[mid] == 0){
                temp = a[mid];
                a[mid] = a[start];
                a[start] = temp;
                start++;
                mid++;
            }
            else if(a[mid] == 2){
                temp = a[mid];
                a[mid] = a[end];
                a[end] = temp;
                end--;
            }
            else if(a[mid] == 1){
                mid++;
            }
        }
        
    }
}