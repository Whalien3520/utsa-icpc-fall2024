// problem link: https://leetcode.com/problems/custom-sort-string/description/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    string customSortString(string order, string s) {
        int arr[26] = {0};
        for(char& c : s)
            arr[c - 'a']++;
        string ret;
        for(char& c : order) {
            ret.append(string(arr[c - 'a'], c));
            arr[c - 'a'] = 0;
        }
        for(int i = 0; i < 26; i++)
            ret.append(string(arr[i], 'a' + i));
        return ret;
    }
};