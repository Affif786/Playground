#include<stdio.h>
#include <math.h>
int bin_to_dec(int n)
{
  int i = 0, decimal = 0;
  while(n != 0)
  {
    decimal = decimal + (n % 10) * pow(2, i);
      i++;
    n = n / 10;
  }
  return decimal;
    //Your code goes here
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",bin_to_dec(n));
}