class Solution {
    public int rob(int[] nums) {
        // int oddMoney = 0;
        // int evenMoney = 0;

        // for(int i =0; i<nums.length; i= i+2){
        //     oddMoney += nums[i];
        // }

        // for(int i=1; i<nums.length; i=i+2){
        //     evenMoney += nums[i];
        // }

        // return Math.max(oddMoney,evenMoney);

        if(nums.length <2){

            return  nums[0];
        }

        int dp[] = new int[nums.length];

        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2; i<nums.length; i++){
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }

        return dp[nums.length-1];
    }
}