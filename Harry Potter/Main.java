#include<iostream>
#include<string>
using namespace std;
int main()
{
  string n, first_digit, last_digit;
  int x, y;
  cin>>n;
  first_digit = (n[0]);
  last_digit = (n[n.length() - 1]);
  x = stoi(first_digit);
  y = stoi(last_digit);
  cout<<(x + y)<<endl;
  //Type your code here.
}