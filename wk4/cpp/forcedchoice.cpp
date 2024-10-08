// problem link: https://open.kattis.com/problems/forcedchoice

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
	int n, p, s;
	cin >> n >> p >> s;
	while(s--) {
	    int m, t;
	    cin >> m;
	    bool f = false;
	    while(m-- > 0) {
	        cin >> t;
	        if(t == p)
	            f = true;
	    }
	    cout << (f ? "KEEP\n" : "REMOVE\n");
	}
	    
	return 0;
}