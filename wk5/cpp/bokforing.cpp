#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    int N, Q, set = 0;
    cin >> N >> Q;
    unordered_map<int, int> m;
    while(Q-- > 0) {
        string s;
        int a;
        cin >> s;
        cin >> a;
        if(s[0] == 'S') {
            int b;
            cin >> b;
            m[a] = b;
        }
        else if(s[0] == 'R') {
            m.clear();
            set = a;
        }
        else {
            if(m.count(a))
                cout << m[a] << endl;
            else
                cout << set << endl;
        }
    }
    
    return 0;
}