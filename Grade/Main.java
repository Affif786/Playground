#include<iostream>
#include<string>
#include<iterator>
using namespace std;
int main()
{
  int size, id, sum = 0;
  string f, l;
  cin>>f;
  cin>>l;
  cin>>id;
  cin>>size;
  int *scores = new int(size);
  for(int i = 0; i < size; i++)
  {
    cin>>scores[i];
  }
  for(int i = 0; i < size; i++)
    sum += scores[i];
  sum = sum / size;
  cout<<f<<"\n";
  cout<<l<<"\n";
  cout<<id<<"\n";
  if(sum >= 90 && sum <= 100)
    cout<<"O";
  else if(sum >= 80 && sum < 90)
    cout<<"E";
  else if(sum >= 70 && sum < 80)
    cout<<"A";
  else if(sum >= 55 && sum < 70)
    cout<<"P";
  else if(sum >= 40 && sum < 55)
    cout<<"D";
  else
    cout<<"T";   
}