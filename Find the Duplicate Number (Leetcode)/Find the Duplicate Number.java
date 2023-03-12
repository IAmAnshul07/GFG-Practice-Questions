class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int temp=0;
        for(int i=1;i<=n;i++){
            temp = nums[i];
            if(temp == nums[i-1]){
                return temp;
            }
        }
        return -1;
    }
}
