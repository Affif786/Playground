#include<iostream>
using namespace std;
int main()
{
  int units, cost;
  cin>>units;
  if(units <= 200)
  {
    cost = 0.5 * units;
  }
  else if(units <= 400)
  {
    cost = units * 0.65 + 100;
  }
  else if(units <= 600)
  {
    cost = units * 0.80 + 200;
  }
  else
  {
    cost = units * 1.25 + 425;
  }
  cout<<"Rs."<<cost;
  //Type your code here.
}