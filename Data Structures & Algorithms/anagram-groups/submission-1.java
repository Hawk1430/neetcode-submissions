class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hmap = new HashMap<>();
        for(String s : strs){

            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String st =  new String(temp);

            if(!hmap.containsKey(st)){
                hmap.put(st, new ArrayList<>());
            }
            hmap.get(st).add(s);
        }

        List<List<String>> result = new ArrayList<List<String>>();

        for(String key: hmap.keySet()){

            result.add(hmap.get(key));
        }
        return result;
    }
}
