// problem link: https://open.kattis.com/problems/inversefactorial

#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    string n;
    cin >> n;
    if(n.size() < 4) {
        int nn = stoi(n), i = 1, c = 1;
        while(c != nn)
            c *= ++i;
        cout << i;
        return 0;
    }
    int i = 1;
    double d = 1.0;
    while(floor(d) < n.size())
        d += log10(i++);
    cout << i - 1;

    return 0;
}