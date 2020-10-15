#include<iostream>
using namespace std;
int main()
{
  int w, x, y, SP, CP, P;
  cin>>w;
  cin>>x;
  cin>>y;
  SP = w * x;
  CP = w * y;
  P = SP - CP;
  P = P - 100;
  cout<<P;
  //Type your code here.
}