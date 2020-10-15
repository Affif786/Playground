#include<iostream>
using namespace std;
int main()
{
  int x1, y1, x2, y2, x3, y3;
  double x_coordinate, y_coordinate;
  cin>>x1;
  cin>>y1;
  cin>>x2;
  cin>>y2;
  cin>>x3;
  cin>>y3;
  x_coordinate = (x1 + x2 + x3) / 3.0;
  y_coordinate = (y1 + y2 + y3) / 3.0;
  cout<<x_coordinate<<endl;
  cout<<y_coordinate<<endl;
  //Type your code here.
}