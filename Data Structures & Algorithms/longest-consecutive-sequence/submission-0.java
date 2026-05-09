class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        for(int num : nums){
            hset.add(num);
        }

        int maxSeq = 0;
        for(int num : hset){
            if(!hset.contains(num - 1)){
                int current  = num;
                int count = 1;
                while( hset.contains(current+1) ){
                    count++;
                    current++;
                }
                maxSeq = Math.max(maxSeq, count);
            }
        }
        return maxSeq;
    }
}
