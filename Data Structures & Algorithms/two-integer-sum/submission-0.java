class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> hmap = new HashMap<>();
        hmap.put(nums[0],0);
        for(int i=1 ; i<nums.length ; i++){
            int temp = target-nums[i];
            if(hmap.containsKey(temp)){
                arr[0] = hmap.get(temp);
                arr[1] = i;
                return arr;
            }
            hmap.put(nums[i],i);
        }
        return arr;

    }
}
