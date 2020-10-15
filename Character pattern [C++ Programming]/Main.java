#include<iostream>
using namespace std;

void printpattern(int n)
{
  int i, j;
  for(i = 0; i < n; i++)
  {
    for(j = 0; j <= i; j++)
    {
      if(j % 2 == 0)
        printf("*");
      else
        printf("#");
    }
    printf("\n");
  }
	//Your code goes here
}


int main()
{
    int a;
    cin>>a;
    printpattern(a);
    return 0;
}
