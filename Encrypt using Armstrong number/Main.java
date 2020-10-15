#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int count = 0, i = n, j = n, sum = 0, last_digit;
  while(n > 0)
  {
    n /= 10;
    count++;
  }
  while(i > 0)
  {
    last_digit = i % 10;
    sum += power(last_digit, count);
    i /= 10;
  }
  if(sum == j)
    return 1;
  else
    return 0;
    //Your code goes here
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}