// problem link: https://leetcode.com/problems/relative-ranks/description/

class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] a = new Integer[score.length];
        for(int i = 0; i < a.length; i++)
            a[i] = i;
        Arrays.sort(a, (x, y) -> score[y] - score[x]);
        String[] ret = new String[score.length];
        ret[a[0]] = "Gold Medal";
        if(ret.length > 1)
            ret[a[1]] = "Silver Medal";
        if(ret.length > 2)
            ret[a[2]] = "Bronze Medal";
        for(int i = 3; i < ret.length; i++)
            ret[a[i]] = Integer.toString(i + 1);
        return ret;
    }
}