class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> hmap = new HashMap<>();
        for(int i = 0; i<strs.length; i++){

            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String st =  new String(temp);

            if(!hmap.containsKey(st)){
                hmap.put(st, new ArrayList<>());
            }
            hmap.get(st).add(i);
        }

        List<List<String>> result = new ArrayList<List<String>>();

        for(String key: hmap.keySet()){
            List<String> temp = new ArrayList<>();
            for(Integer i : hmap.get(key)){
                temp.add(strs[i]);
            }
            result.add(temp);
        }
        return result;
    }
}
