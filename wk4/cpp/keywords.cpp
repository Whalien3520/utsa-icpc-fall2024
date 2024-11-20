// problem link: https://open.kattis.com/problems/keywords

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    int n, ret = 0;
    cin >> n;
    string l;
    getline(cin, l);
    unordered_set<string> s;
    while(n--) {
        getline(cin, l);
        for(int i = 0; i < l.size(); i++) {
            l[i] = tolower(l[i]);
            if(l[i] == '-')
                l[i] = ' ';
        }
        if(!s.count(l)) {
            s.insert(l);
            ret++;
        }
    }
    cout << ret;

    return 0;
}
