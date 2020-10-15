#include<iostream>
using namespace std;
int main()
{
  int n, res, sum = 0, temp;
  cin>>n;
  temp = n;
  while(temp)
  {
    sum += temp % 10;
    temp /= 10;
  }
  res = n % sum;
  if(res == 0)
  cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  
  //Type your code here.
}