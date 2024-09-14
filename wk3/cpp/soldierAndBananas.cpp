// problem link: https://codeforces.com/problemset/problem/546/A
// solution link: https://codeforces.com/contest/546/submission/281130196

#include <bits/stdc++.h>
using namespace std;

int main()
{
	ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
	long k, n, w;
	cin >> k >> n >> w;
	long nn = w * (w + 1) / 2 * k;
	if(nn <= n)
		cout << 0;
	else
		cout << nn - n;

	return 0;
}