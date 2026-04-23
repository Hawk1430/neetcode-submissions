class Solution {
    public boolean hasDuplicate(int[] nums) {
        Stack<Integer> st  = new Stack<>();
        for(int num : nums){
            if(st.contains(num)){
                return true;
            }
            else{
                st.push(num);
            }
        }
        return false;
    }
}