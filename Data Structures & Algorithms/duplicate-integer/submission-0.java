class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int num : nums){
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        for(Integer key:hmap.keySet()){
            if(hmap.get(key)>1){
                return true;
            }
        }
        return false;
    }
}
