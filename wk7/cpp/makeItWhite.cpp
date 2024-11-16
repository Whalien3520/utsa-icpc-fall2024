// problem link: https://codeforces.com/problemset/problem/1927/A
// solution link: https://codeforces.com/contest/1927/submission/291241493

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    int t;
    cin >> t;
    while(t--) {
        int n;
        cin >> n;
        string s;
        cin >> s;
        int l = 0, h = n - 1;
        while(s[l] != 'B')
            l++;
        while(s[h] != 'B')
            h--;
        cout << (h - l + 1) << endl;
    }

    return 0;
}