// problem link: https://atcoder.jp/contests/abc351/tasks/abc351_b
// solution link: https://atcoder.jp/contests/abc351/submissions/60489170

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    int N;
    cin >> N;
    string a[N];
    for(int i = 0; i < N; i++)
        cin >> a[i];
    bool flag = true;
    for(int i = 0; i < N && flag; i++) {
        string b;
        cin >> b;
        for(int j = 0; j < N && flag; j++)
            if(a[i][j] != b[j]) {
                flag = false;
                cout << (i + 1) << " " << (j + 1);
            }
    }
    
    return 0;
}