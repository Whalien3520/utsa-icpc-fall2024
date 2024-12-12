// problem link: https://codeforces.com/contest/2000/problem/E
// solution link: https://codeforces.com/contest/2000/submission/295424332

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    int t;
    cin >> t;
    while(t--) {
        int n, m, k, w;
        cin >> n >> m >> k >> w;
        vector<long long> a(w);
        while(w--)
            cin >> a[w];
        sort(a.begin(), a.end());
        priority_queue<long long> pq;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                pq.push((min(i, n - k) - max(-1, i - k)) * (min(j, m - k) - max(-1, j - k)));
        long long ret = 0;
        
        for(int i = a.size() - 1; i > -1; i--, pq.pop())
            ret += a[i] * pq.top();
        cout << ret << '\n';
    }
        
    return 0;
}