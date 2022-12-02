// } Driver Code Ends


// User function Template for Java

class Solution {
    int MissingNumber(int array[], int n) {
        Arrays.sort(array);
        for(int i=0;i<n;i++){
            if(i == n-1){
                return i+1;
            }else{
                if(i+1 != array[i]){
                    return i+1;
                }
            }
        }
        return 0;
    }
}