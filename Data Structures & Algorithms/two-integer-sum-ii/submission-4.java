class Solution {
    public int[] twoSum(int[] nums, int target) {
        int st = 0;
        int ed = 0;

        while (st < nums.length) {

            int req = target - nums[st];

            if (req > nums[nums.length - 1]) {
                st++;
                continue;
            } else {

                ed = st + 1;

                while (ed < nums.length) {

                    if (nums[ed] == req) {
                        return new int[]{st + 1, ed + 1};
                    }

                    ed++;
                }

                st++;
            }
        }

        return new int[]{};
    }
}