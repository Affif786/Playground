#include<iostream>
using namespace std;
int main()
{
  int n, c = 0;
  cin>>n;
  cout<<n;
  cout<<"\n";
  while(n != 1)
  {
    if(n == 1)
    {
      cout<<n;
      break;
    }
    else if(n % 2 == 0)
    {
      n /= 2;
      c++;
      cout<<n;
      cout<<"\n";
    }
    else if(n % 2 != 0)
    {
      n = 3 * n + 1;
      c++;
      cout<<n;
      cout<<"\n";
    }
  //Type your code here.
}
  cout<<c;
}