class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            List<String> temp = map.getOrDefault(key, new ArrayList<>());

            temp.add(strs[i]); // original string

            map.put(key, temp);
        }

        for (String key : map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }
}
