#include <iostream>
using namespace std;
int gcd(int a, int b)
{
  int small, ans;
  if(a < b)
    small = a;
  else
    small = b;
  while(small >= 1)
  {
    if((a % small == 0) && (b % small == 0))
    {
      ans = small;
      return ans;
    }
    small--;
  }
}
int main()
{
  int a, b, c, ans, gcd1, gcd2;
  cin>>a;
  cin>>b;
  cin>>c;
  cin>>ans;
  gcd1 = gcd(a, b);
  gcd2 = gcd(gcd1, c);
  if(ans == gcd2)
  {
      cout<<"Answer is correct.";
  }
  else
    cout<<"Answer is wrong.";
}