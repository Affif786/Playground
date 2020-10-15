#include <iostream>
using namespace std;
int main()
{
  int n, i, flag;
  cin>>n;
  if(n > 1)
  {
  for(i = 2; i < n; i++)
  {
    if(n % i == 0)
    {
      cout<<"Not eligible";
      break;
    }
  }
  if(i == n)
  cout<<"Eligible";
  }
  else
    cout<<"Not eligible";
}