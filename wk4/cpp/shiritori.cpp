// problem link: https://open.kattis.com/problems/shiritori

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
	int N;
	cin >> N;
	string p;
	getline(cin, p);
	cin >> p;
	unordered_set<string> s;
	s.insert(p);
	for(int i = 1; i < N; i++) {
	    string t;
	    cin >> t;
	    if(s.count(t) || t[0] != p[p.size() - 1]) {
	        cout << "Player " << i % 2 + 1 << " lost";
	        return 0;
	    }
	    s.insert(t);
	    p = t;
	}
	cout << "Fair Game";
	    
	return 0;
}