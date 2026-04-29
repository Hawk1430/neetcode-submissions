class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqmap = new HashMap<>();

        //to coubt freq of each
        for(int num : nums){
            freqmap.put(num, freqmap.getOrDefault(num, 0) + 1) ;
        }

        //made a bucket where freq of element  = index
        List<Integer>[] bucketList = new List[nums.length + 1];
        for(int i = 0; i< bucketList.length; i++){
            bucketList[i] = new ArrayList<>();
        }

        //add the num of nums on those freq = index
        for(Map.Entry<Integer, Integer> entry : freqmap.entrySet()){
            bucketList[entry.getValue()].add(entry.getKey());
        }

        int [] result = new int[k];
        int index = 0;

        for(int i = bucketList.length - 1; i >=0 && index < k; i--){
            for(int num: bucketList[i]){
                if(index == k){
                    return result;
                }
                result[index] = num;
                index++;
            }
        }

        return result;



    }
}
