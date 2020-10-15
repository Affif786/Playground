#include<iostream>
using namespace std;
int main()
{
  int number, result;
  cin>>number;
  result = (number % 2) == 0 ? 1 : 0;
  if(result == 1)
    cout<<"Even";
  else
    cout<<"Odd";
  //Type your code here.
}