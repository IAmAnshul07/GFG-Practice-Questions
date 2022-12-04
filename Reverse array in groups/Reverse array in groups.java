class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int newArray[] = new int [n];
        for(int i=0;i<n;i++){
            newArray[i] = arr.get(i);
        }
        for(int i=0;i<n;i+=k){
            int start = i, end = Math.min(i+k-1,n-1);
            while(start<=end){
                int temp = newArray[start];
                newArray[start] = newArray[end];
                newArray[end] = temp;
                start++;
                end--;
            }
        }
        arr.clear();
        for(int i=0;i<n;i++){
            arr.add(newArray[i]);
        }
}
}