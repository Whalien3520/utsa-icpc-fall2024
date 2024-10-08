// problem link: https://open.kattis.com/problems/jollyjumpers

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
	int n;
	while(cin >> n) {
	    vector<bool> l(n, false);
	    int p;
	    cin >> p;
	    bool f = true;
	    for(int i = 1; i < n; i++) {
	        int c;
	        cin >> c;
	        if(!f)
	            continue;
	        if(c == p || abs(c - p) >= n || l[abs(c - p)])
	            f = false;
	        else {
	            l[abs(c - p)] = true;
	            p = c;
	        }
	    }
	    cout << (f ? "Jolly\n" : "Not jolly\n");
	}
	    
	return 0;
}