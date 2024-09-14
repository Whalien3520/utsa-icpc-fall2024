// problem link: https://open.kattis.com/problems/tripletexting

#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    string t;
    cin >> t;
    string a = t.substr(0, t.size() / 3), b = t.substr(t.size() / 3, t.size() / 3), c = t.substr(2 * (t.size() / 3), 2 * (t.size() / 3));
    if(a == b || a == c)
        cout << a;
    else
        cout << b;
    
    return 0;
}