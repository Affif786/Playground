#include <iostream>
using namespace std;
int main()
{
  int principle, rate, time;
  double amount, si, discount = 2, final_amount;
  cin>>principle;
  cin>>rate;
  cin>>time;
  si = (principle * rate * time) / 100;
  amount = principle + si;
  discount = (discount * si) / 100;
  final_amount = principle + si - discount;
  cout<<si<<endl;
  cout<<amount<<endl;
  cout<<discount<<endl;
  cout<<final_amount<<endl;
  //Type your code here.
}