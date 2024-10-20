// problem link: https://leetcode.com/problems/most-common-word/description/

class Solution {
public:
    string mostCommonWord(string paragraph, vector<string>& banned) {
        unordered_set<string> ban;
        for(string b : banned)
            ban.insert(b);
        string cur = "", split = "[!?',;. ]", ret = "";
        int max = 0;
        unordered_map<string, int> m;
        for(int i = 0; i < paragraph.size(); i++) {
            if(split.find(paragraph[i]) != string::npos) {
                if(cur.compare("") && !ban.contains(cur))
                    m[cur]++;
                cur = "";
            }
            else
                cur.push_back(tolower(paragraph[i]));
        }
        if(cur.compare("") && !ban.contains(cur))
            m[cur]++;
        for(auto s : m)
            if(s.second > max) {
                cout << s.second << s.first << endl;
                max = s.second;
                ret = s.first;
            }
        return ret;
    }
};