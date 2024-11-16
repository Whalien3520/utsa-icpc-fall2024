// problem link: https://atcoder.jp/contests/abc347/tasks/abc347_b
// solution link: https://atcoder.jp/contests/abc347/submissions/59882569

#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    string S;
    cin >> S;
    unordered_set<string> s;
    int ret = 0;
    for(int i = 0; i < S.length(); i++)
        for(int j = 1; j <= S.length() - i; j++)
            if(!s.contains(S.substr(i, j))) {
                s.insert(S.substr(i, j));
                ret++;
            }
    cout << ret;

    return 0;
}