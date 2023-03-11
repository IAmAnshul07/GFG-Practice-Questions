//User function Template for Java

class Compute {
    
    public void rotate(int arr[], int n)
    {
        for(int i=0;i<n;i++){
            int temp=0;
           temp = arr[n-1];
            arr[n-1] = arr[i];
            arr[i] = temp;
        }
    }
}