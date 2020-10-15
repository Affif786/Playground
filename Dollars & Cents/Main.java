#include<iostream>

using namespace std;
int main()
{
  int dollar, dollar1, cent, cent1, total_dollar, total_cent;
  cin>>dollar;
  cin>>cent;
  cin>>dollar1;
  cin>>cent1;
  total_dollar = dollar + dollar1;
  total_cent = cent + cent1;
  while(total_cent > 100)
  {
    total_cent -= 100;
    total_dollar += 1;
  }
  cout<<total_dollar<<endl;
  cout<<total_cent<<endl;
}