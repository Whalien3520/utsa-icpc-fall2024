// problem link: https://codeforces.com/problemset/problem/4/A
// solution link: https://codeforces.com/contest/4/submission/281129642

#include <bits/stdc++.h>
using namespace std;

int main()
{
	ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);

	int w;
	cin >> w;
	cout << (w > 2 && w % 2 == 0 ? "YES" : "NO");

	return 0;
}