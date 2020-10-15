#include <iostream>
using namespace std;
int main()
{
  int a, b, c, i, sum = 0;
  cin>>a;
  cin>>b;
  c = a + b;
  for(i = 1; i <c; i++)
  {
    if(c % i == 0)
    {
      sum += i;
    }
  }
  if(c == sum)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}