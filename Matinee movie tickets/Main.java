#include<iostream>
using namespace std;
int main()
{
  int age;
  float show_time;
  float w, x, y, z;
  cin>>age;
  cin>>show_time;
  w = 10.15, x = 13.30, y = 18.00, z = 22.00;
  if(age <= 13)
  {
    if(show_time == x || show_time == z)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  }
  else
  {
    if(show_time == x || show_time == z)
      cout<<"$5.00";
    else
      cout<<"$8.00";
  }
  //Type your code here.
}