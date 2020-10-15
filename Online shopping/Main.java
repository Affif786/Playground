#include<iostream>
using namespace std;
int main()
{
  int flip_amt, flip_dis, flip_ship, snap_amt, snap_dis, snap_ship, ama_amt, ama_dis, ama_ship;
  cin>>flip_amt;
  cin>>flip_dis;
  cin>>flip_ship;
  cin>>snap_amt;
  cin>>snap_dis;
  cin>>snap_ship;
  cin>>ama_amt;
  cin>>ama_dis;
  cin>>ama_ship;
  int flip_price = flip_amt - ((flip_amt * flip_dis) / 100) + flip_ship;
  int snap_price = snap_amt - ((snap_amt * snap_dis) / 100) + snap_ship;
  int ama_price = ama_amt - ((ama_amt * ama_dis) / 100) + ama_ship;
  cout<<"In Flipkart Rs."<<flip_price<<endl;
  cout<<"In Snapdeal Rs."<<snap_price<<endl;
  cout<<"In Amazon Rs."<<ama_price<<endl;
  if((flip_price <= snap_price) && (flip_price < ama_price))
  cout<<"He will prefer Flipkart";
  else if((snap_price < flip_price) && (snap_price < ama_price))
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
  //Type your code here.
}