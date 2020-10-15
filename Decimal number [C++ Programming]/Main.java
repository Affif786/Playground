#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
  int octal = 0, i = 1;
  while(n != 0)
  {
    octal = octal + (n % 8) * i;
    n = n / 8;
    i = i * 10;
  }
  return octal;
    //Your code goes here

}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
