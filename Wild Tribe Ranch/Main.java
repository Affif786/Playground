#include <iostream>
using namespace std;
int main()
{
  int w, mw;
  cin>>mw;
  cin>>w;
  if(w > mw)
    cout<<"Sorry, you can't enter";
  else if(w < mw)
    cout<<"Yes, you can enter.";
  else
    cout<<"Yes, you can enter. Kindly use a rope.";
}