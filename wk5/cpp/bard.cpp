#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    int N, E, songs = 0;
    cin >> N >> E;
    bool t[E][N + 1] = {};
    for(int i = 0; i < E; i++) {
        vector<int> a;
        int K, n;
        cin >> K;
        bool flag = false;
        while(K--) {
            cin >> n;
            a.push_back(n);
            flag |= (n == 1);
        }
        if(flag) {
            for(int j = 0; j < a.size(); j++)
                t[songs][a[j]] = true;
            songs++;
        }
        else {
            for(int j = 0; j < songs; j++)
                for(int k = 0; k < a.size(); k++)
                    if(t[j][a[k]]) {
                        for(int l = 0; l < a.size(); l++)
                            t[j][a[l]] = true;
                        break;
                    }
        }
    }
    for(int i = 1; i < N + 1; i++) {
        bool flag = true;
        for(int j = 0; j < songs && flag; j++)
            flag &= t[j][i];
        if(flag)
            cout << i << endl;
    }
    
    return 0;
}