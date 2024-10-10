// problem link: https://open.kattis.com/problems/antipalindrome

#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    string t;
    getline(cin, t);
    for(char& c : t)
        c = tolower(c);
    int pp = -1;
    while(!isalpha(t[++pp])) {}
    
    int p = pp;
    while(p < t.size() && !isalpha(t[++p])) {}
    if(p >= t.size()) {
        cout << "Anti-palindrome";
        return 0;
    }
    if(t[p] == t[pp]) {
        cout << "Palindrome";
        return 0;
    }
    
    for(int i = p + 1; i < t.size(); i++) {
        if(!isalpha(t[i]))
            continue;
        if(t[i] == t[p] || t[i] == t[pp]) {
            cout << "Palindrome";
            return 0;
        }
        pp = p;
        p = i;
    }
    
    cout << "Anti-palindrome";

    return 0;
}