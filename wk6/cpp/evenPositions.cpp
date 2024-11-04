// problem link: https://codeforces.com/contest/1997/problem/C
// solution link: https://codeforces.com/contest/1997/submission/289854060

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--) {
        int n, r = 0;
        string s;
        cin >> n >> s;
        vector<int> v;
        for(int i = 0; i < n; i++) {
            if((i % 2 == 0 && v.empty()) || s[i] == '(')
                v.push_back(i);
            else {
                r += i - v.back();
                v.pop_back();
            }
        }
        cout << r << endl;
    }
}