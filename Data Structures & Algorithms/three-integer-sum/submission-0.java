class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0){
                        List<Integer> triplets = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplets);
                        set.add(triplets);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
