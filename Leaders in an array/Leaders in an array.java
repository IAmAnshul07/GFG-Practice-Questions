class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> leader=new ArrayList<>();
        int big=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=big){
                leader.add(arr[i]);
                big=arr[i];
            }
        }
        Collections.reverse(leader);
        return leader;
    }
}