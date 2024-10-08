// problem link: https://open.kattis.com/problems/proofs

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
	int n;
	cin >> n;
	string g;
	getline(cin, g);
	unordered_set<string> s;
	for(int i = 1; i <= n; i++) {
	    bool f = true;
	    string t;
	    cin >> t;
	    while(f && t != "->") {
	        f = s.count(t);
	        cin >> t;
	    }
	    cin >> t;
	    if(!f) {
	        cout << i;
	        return 0;
	    }
	    s.insert(t);
	}
	cout << "correct";
	    
	return 0;
}