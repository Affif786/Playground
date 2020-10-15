#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x, y, distance;
  cin>>x;
  cin>>y;
  distance = pow(pow((x - 3), 2) + pow((y - 4), 2), 0.5);
  cout<<round(distance)<<endl;
  //Type your code here.
}