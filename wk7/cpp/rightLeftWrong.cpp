// problem link: https://codeforces.com/problemset/problem/2000/D
// solution link: https://codeforces.com/contest/2000/submission/291812374

#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    int t;
    cin >> t;
    while(t--) {
        int n, x;
        cin >> n;
        vector<int> a;
        for(int i = 0; i < n; i++) {
            cin >> x;
            a.push_back(x);
        }
        string s;
        cin >> s;
        
        long long pre[n + 1];
        for(int i = 0; i < n; i++)
            pre[i + 1] = a[i] + pre[i];
        
        int l = 0, h = n - 1;
        long long ret = 0;
        while(l < h) {
            if(s[l] != 'L')
                l++;
            else if(s[h] != 'R')
                h--;
            else {
                ret += pre[h + 1] - pre[l];
                l++;
                h--;
            }
        }
        cout << ret << endl;
    }

    return 0;
}