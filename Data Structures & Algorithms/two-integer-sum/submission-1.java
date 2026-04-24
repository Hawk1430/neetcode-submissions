class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();

        for( int i=0; i<nums.length; i++){
            int left  = target - nums[i];

            if(hmap.containsKey(left)){
                if( i > hmap.get(left)){
                    return new int[]{hmap.get(left), i};
                }
                return new int[]{i, hmap.get(left)};
            }
            hmap.put(nums[i], i);
        }
        return new int[]{};
    }
}
