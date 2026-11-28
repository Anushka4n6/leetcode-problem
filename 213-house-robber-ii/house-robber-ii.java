
class Solution {

    int fun(int i, int end, int[] nums, int[] dp) {

        if (i > end)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int c1 = nums[i] + fun(i + 2, end, nums, dp);
        int c2 = fun(i + 1, end, nums, dp);

        return dp[i] = Math.max(c1, c2);
    }

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return nums[0];

        // Case 1: Exclude last house
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);

        int case1 = fun(0, n - 2, nums, dp1);

        // Case 2: Exclude first house
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);

        int case2 = fun(1, n - 1, nums, dp2);

        return Math.max(case1, case2);
    }
}
