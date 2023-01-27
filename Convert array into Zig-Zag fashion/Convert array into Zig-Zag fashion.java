class Solution{
    public void zigZag(int a[], int n){
        int temp=0;
        for(int i=1;i<n;i+=2){
            if(a[i]<a[i-1]){
                temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
            if(i+1<n && a[i+1] > a[i]){
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
    }
}