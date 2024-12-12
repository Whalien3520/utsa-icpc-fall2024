// problem link: https://atcoder.jp/contests/abc364/tasks/abc364_b
// solution link: https://atcoder.jp/contests/abc364/submissions/60489261

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    int H, W, Si, Sj;
    cin >> H >> W >> Si >> Sj;
    --Si;
    --Sj;
    string C[H], X;
    for(int i = 0; i < H; i++)
        cin >> C[i];
    cin >> X;
    for(int i = 0; i < X.size(); i++) {
        int ii = Si, jj = Sj;
        if(X[i] == 'L')
            jj--;
        else if(X[i] == 'R')
            jj++;
        else if(X[i] == 'U')
            ii--;
        else if(X[i] == 'D')
            ii++;
        if(ii > -1 && ii < H && jj > -1 && jj < W && C[ii][jj] == '.') {
            Si = ii;
            Sj = jj;
        }
    }
    cout << ++Si << " " << ++Sj;
    
    return 0;
}