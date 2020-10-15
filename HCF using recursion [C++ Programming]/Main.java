#include <iostream>
using namespace std;

int hcf(int n1, int n2);

int main()
{
   int n1, n2;
   cin >> n1 >> n2;
   cout <<hcf(n1, n2);
   return 0;
}

int hcf(int n1, int n2)
{
  if(n1 == 0)
    return n2;
  else if(n2 == 0)
    return n1;
  else if(n1 > n2)
    return hcf(n1 - n2, n2);
  else
    return hcf(n1, n2 - n1);
}