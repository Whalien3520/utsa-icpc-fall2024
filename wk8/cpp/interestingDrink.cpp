// problem link: https://codeforces.com/contest/706/problem/B
// solution link: https://codeforces.com/contest/706/submission/294480524

#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    int n, t, q;
    cin >> n;
    vector<int> x(n);
    while(n--)
        cin >> x[n];
    sort(x.begin(), x.end());
    cin >> q;
    while(q--) {
        cin >> t;
        cout << upper_bound(x.begin(), x.end(), t) - x.begin() << '\n';
    }

    return 0;
}