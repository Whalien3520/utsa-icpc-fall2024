// problem link: https://leetcode.com/problems/most-common-word/description/

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // String processing is annoying
        String[] arr = paragraph.toLowerCase().split("[!?',;. ]");
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.sort(banned);
        int max = -1;
        String ret = "";
        for(String s : arr) {
            if(s.equals(""))
                continue;
            if(Arrays.binarySearch(banned, s) < 0) {
                if(!map.containsKey(s))
                    map.put(s, 1);
                else
                    map.put(s, map.get(s) + 1);
                if(map.get(s) > max) {
                    max = map.get(s);
                    ret = s;
                }
            }
        }
        return ret;
    }
}