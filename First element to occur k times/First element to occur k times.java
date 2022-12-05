class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        int[] count = new int[100001];
        for(int i : a){
            count[i]++;
            if(count[i]==k){
                return i;
            }
        }
        return -1;
    }
}