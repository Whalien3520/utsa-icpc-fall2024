// problem link: https://open.kattis.com/problems/apaxianparent

#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    string y, p, v = "aeiou";
    cin >> y >> p;
    if(v.find(y[y.size() - 1]) != string::npos)
        cout << y.substr(0, y.size() - 1) << "ex" << p;
    else if(y[y.size() - 2] == 'e' && y[y.size() - 1] == 'x')
        cout << y << p;
    else
        cout << y << "ex" << p;
    
    return 0;
}