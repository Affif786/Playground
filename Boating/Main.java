#include<iostream>
using namespace std;
int main()
{
  int max_weight, no_adult, no_child, adult_weight, child_weight;
  cin>>max_weight;
  cin>>no_adult;
  cin>>no_child;
  adult_weight = 75 * no_adult;
  child_weight = 30 * no_child;
  if((adult_weight + child_weight) <= max_weight)
  {
    cout<<"Boat is stable";
  }
  else
    cout<<"Boat will drow";
  //Type your code here.
}