// problem link: https://open.kattis.com/problems/ferryloading4

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int c;
    cin >> c;
    while(c--) {
        int l, m;
        cin >> l >> m;
        l *= 100;
        vector<int> le, ri;
        while(m--) {
            string s;
            int i;
            cin >> i >> s;
            if(s == "left")
                le.push_back(i);
            else
                ri.push_back(i);
        }
        
        int r = 0;
        bool onLe = true;
        while(!le.empty() || !ri.empty()) {
            int rem = l;
            if(onLe)
                while(!le.empty() && le.back() <= rem) {
                    rem -= le.back();
                    le.pop_back();
                }
            else
                while(!ri.empty() && ri.back() <= rem) {
                    rem -= ri.back();
                    ri.pop_back();
                }
            onLe = !onLe;
            r++;
        }
        cout << r << endl;
    }
}