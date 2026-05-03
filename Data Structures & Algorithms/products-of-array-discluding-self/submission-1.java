class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==1) return nums;

        int [] prefixProd = new int[nums.length];
        int [] suffixProd = new int[nums.length];

        int prod = 1;
        for(int i = 0; i<nums.length; i++){
            prefixProd[i] = prod*nums[i];
            prod = prefixProd[i];
        }

        prod = 1;
        for(int i = nums.length-1; i>0; i--){
            suffixProd[i] = prod*nums[i];
            prod = suffixProd[i];
        }

        int[] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(i==0){
                result[i] = suffixProd[i+1];
            }
            else if(i == nums.length-1){
                result[i] = prefixProd[i-1];
            }
            else{
                result[i] = prefixProd[i-1] * suffixProd[i+1];
            }
        }

        return result;
        

    }
}  
