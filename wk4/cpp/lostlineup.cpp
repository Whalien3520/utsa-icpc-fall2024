// problem link: https://open.kattis.com/problems/lostlineup

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
	int n, i = 2;
	cin >> n;
	int r[n];
	r[0] = 1;
	while(--n) {
	    int t;
	    cin >> t;
	    r[t + 1] = i++;
	}
	for(auto t : r)
	    cout << t << " ";
	    
	return 0;
}