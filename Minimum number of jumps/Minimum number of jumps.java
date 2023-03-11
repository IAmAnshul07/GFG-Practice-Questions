class Solution{
    static int minJumps(int[] arr){
        // your code here
        int jump=0, farthest=0,current=0;
        for(int i=0;i<arr.length-1;i++){
            if(i==current && arr[current] ==0 && current==farthest){
                return -1;
            }
            farthest = Math.max(farthest, arr[i]+i);
            if(i==current){
                current = farthest;
                jump++;
            }
        }
        return jump;
    }
}