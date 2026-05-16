class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        //Brute Force 
        // int n = nums.length;
        // Set<List<Integer>> set = new HashSet<>();
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         for(int k=j+1;k<n;k++){
        //             int sum = nums[i] + nums[j] + nums[k];
        //             if(sum == 0){
        //                 List<Integer> triplets = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 Collections.sort(triplets);
        //                 set.add(triplets);
        //             }
        //         }
        //     }
        // }


        // Optimal Solution
        //TC - n^2 + log M  but we are using space
        // Set<List<Integer>> ans = new HashSet<>();
        // for(int i=0;i<n-1;i++){
        //     Set<Integer> hset  = new HashSet<>();
        //     for(int j=i+1;j<n;j++){ 
        //         int third = -(nums[i] + nums[j]);
        //         if(hset.contains(third)){
        //             List<Integer> triplets = Arrays.asList(nums[i], nums[j], third);
        //             Collections.sort(triplets);
        //             ans.add(triplets);
        //         }
        //         hset.add(nums[j]);
        //     }
        // }

        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0; i<n-1; i++){ 
            int j = i+1;
            int k = n-1;
            while(j<k && j<n && k>=0){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> triplets = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(triplets);
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
