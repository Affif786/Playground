#include <iostream>
using namespace std;
int main()
{
  int a, b, i, j, sum;
  cin>>a;
  cin>>b;
  for(i = a; i <=b; i++)
  {
    sum = 0;
  	for(j = 1; j <= i / 2; j++)
  	{
  		if((i % j) == 0)
  		{
  			sum = sum + j;
		}
	}
	if(sum == i)
	cout<<i<<" ";
  }
}