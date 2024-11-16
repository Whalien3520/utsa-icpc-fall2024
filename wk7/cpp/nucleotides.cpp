// problem link: https://open.kattis.com/problems/nucleotides

#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
    char n[4] = {'A', 'T', 'G', 'C'};
    string c;
    cin >> c;
    int itab[c.size() + 1][4] = {{0}};
    for(int i = 0; i < c.size(); i++) {
        itab[i + 1][(c[i] >> 1) % 4]++;
        for(int j = 0; j < 4; j++)
            itab[i + 1][j] += itab[i][j];
    }
    int m;
    cin >> m;
    while(m--) {
        int s, e;
        cin >> s >> e;
        int temp[4];
        for(int i = 0; i < 4; i++)
            temp[i] = itab[e][i] - itab[s - 1][i];
            
        int t = temp[1];
        temp[1] = temp[2];
        temp[2] = temp[3];
        temp[3] = t;
        
        int mask = 0;
        while(mask != 15) {
            int i = 0;
            while(((mask >> i) & 1) == 1)
                i++;
            for(int j = i + 1; j < 4; j++) 
                if(((mask >> j) & 1) != 1 && temp[j] > temp[i])
                    i = j;
                cout << n[i];
                mask |= 1 << i;
        }
        cout << endl;
    }

    return 0;
}