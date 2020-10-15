#include<stdio.h>
int dec_to_bin(int n)
{
  int i = 1;
  int binary = 0;
  while(n != 0)
  {
    binary = binary + (n % 2) * i;
    n = n / 2;
    i = i * 10;
  }
  return binary;
   //Your code goes here
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
