// problem link: https://open.kattis.com/problems/throwns

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);

    int n, k;
    cin >> n >> k;
    vector<int> v;
    while(k--) {
        string s;
        cin >> s;
        if(s[0] == 'u') {
            int i;
            cin >> i;
            while(i--)
                v.pop_back();
        }
        else
            v.push_back(stoi(s));
    }
    int r = 0;
    for(auto const &i : v)
        r += i;
    while(r < 0)
        r += n;
    r %= n;
    cout << r << endl;

	return 0;
}