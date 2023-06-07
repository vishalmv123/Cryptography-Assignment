#include <iostream>
#include <utility> 
 
using namespace std;

pair<int, pair<int, int> > extendedEuclid(int a, int b) 
{
    int x = 1, y = 0;
    int xLast = 0, yLast = 1;
    int q, r, m, n;
    while (a != 0) 
    {
        q = b / a;
        r = b % a;
        m = xLast - q * x;
        n = yLast - q * y;
        xLast = x; 
        yLast = y;
        x = m; 
        y = n;
        b = a; 
        a = r;
    }
    return make_pair(b, make_pair(xLast, yLast));
}
 
int modInverse(int a, int m) 
{
    return (extendedEuclid(a, m).second.first + m) % m;
}
 
//Main
int main()
{
    int a, m;
    cout<<"Enter number to find modular multiplicative inverse: ";
    cin>>a;
    cout<<"Enter Modular Value: ";
    cin>>m;
    cout<<modInverse(a, m)<<endl;
}
