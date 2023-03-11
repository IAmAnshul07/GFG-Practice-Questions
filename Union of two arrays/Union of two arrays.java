class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<n;i++){
            hashSet.add(a[i]);
        }
        for(int j=0;j<m;j++){
            hashSet.add(b[j]);
        }
        
        return hashSet.size();
    }
}