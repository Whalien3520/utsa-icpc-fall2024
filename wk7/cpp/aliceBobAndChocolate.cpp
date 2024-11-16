// problem link: https://codeforces.com/problemset/problem/6/C
// solution link: https://codeforces.com/contest/6/submission/291813118

#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    int n, x;
    cin >> n;
    vector<int> a;
    for(int i = 0; i < n; i++) {
        cin >> x;
        a.push_back(x);
    }
    int l = 0, h = n - 1, c = 0;
    while(l <= h) {
        if(c <= 0)
            c += a[l++];
        else
            c -= a[h--];
    }
    cout << l << " " << (a.size() - l);

    return 0;
}