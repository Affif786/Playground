#include<iostream>
using namespace std;
int main()
{
  int no_items;
  float heat_time, total_heat_time;
  cin>>no_items;
  cin>>heat_time;
  if(no_items == 2)
  {
    //total_heat_time = no_items * heat_time;
    total_heat_time = heat_time + ((50 * heat_time) / 100);
    printf("%.2f", total_heat_time);
  }
  if(no_items == 3)
  {
    //total_heat_time = no_items * heat_time;
    total_heat_time = 2 * heat_time;
    printf("%.2f", total_heat_time);
  }
  if(no_items > 3)
  cout<<"Number of items is more";
  //Type your code here.
}