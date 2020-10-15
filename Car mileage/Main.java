#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int avail_pet, distance;
  cin>>mileage;
  cin>>avail_pet;
  cin>>distance;
  if(distance <= (mileage * avail_pet))
  {
    cout<<"Can reach";
  }
  else
    cout<<"Cannot reach";
  //Type your code here.
}