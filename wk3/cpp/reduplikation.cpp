// problem link: https://open.kattis.com/problems/reduplikation

#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    string s;
    int a;
    cin >> s >> a;
    for(int i = 0; i < a; i++)
        cout << s;

    return 0;
}