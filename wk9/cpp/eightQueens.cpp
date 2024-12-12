// problem link: https://open.kattis.com/problems/8queens

#include <bits/stdc++.h>
using namespace std;

void fill(bool (&tab)[8][8], int r, int c) {
    int moves[8][2] = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
    for(const auto& move : moves) {
        int rr = r, cc = c;
        while(0 <= rr && rr < 8 && 0 <= cc && cc < 8) {
            tab[rr][cc] = true;
            rr += move[0];
            cc += move[1];
        }
    }
}

int main() {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    
	bool tab[8][8] = {{false}};
	int count = 0;
	for(int i = 0; i < 8; i++) {
		string s;
		cin >> s;
		for(int j = 0; j < 8; j++) {
			if(s[j] == '.')
				continue;
			count++;
			if(tab[i][j]) {
				cout << "invalid";
				return 0;
			}
			fill(tab, i, j);
		}
	}
	if(count < 8)
		cout << "invalid";
	else
		cout << "valid";
    
    return 0;
}