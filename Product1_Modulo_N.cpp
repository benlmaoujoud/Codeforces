#include <iostream>
#include <cmath>
#include <vector>
#include <algorithm>
#define ll long long
using namespace std;

void solve() {

    vector<ll> v1 ;
    ll  n ;
    cin >> n ;

    for( ll i = 1 ; i<n ; i++) {
        if(__gcd(n,i) == 1)
            v1.push_back(i);
    }

    ll prod = 1;
    ll size = v1.size();

        for(ll i = 0 ; i<size ; i++)
            prod = (prod*v1[i])%n;

    if(prod == 1) {
        cout <<size<<"\n";

        for(ll i=0 ; i<size;i++)
            cout <<v1[i]<<" ";
    }

    else{
        size--;
        cout << size<<"\n";
        for(int i=0 ; i<size;i++)
            cout <<v1[i]<<" ";
    }
}

int main() {

    solve();
    return 0;
}

