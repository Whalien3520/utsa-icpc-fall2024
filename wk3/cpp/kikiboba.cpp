// problem link: https://open.kattis.com/problems/kikiboba

#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    string s;
    int b = 0, k = 0;
    cin >> s;
    for(char& c : s) {
        if(c == 'b')
            b++;
        else if(c == 'k')
            k++;
    }
    if(b == k) {
        if(b == 0)
            cout << "none";
        else
            cout << "boki";
    }
    else {
        if(b > k)
            cout << "boba";
        else
            cout << "kiki";
    }
    
    return 0;
}