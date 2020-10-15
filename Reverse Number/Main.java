#include <iostream>
using namespace std;
int main() 
{
  	int sum = 0, reverse, n;
  	cin>>n;
  	while(n > 0)
    {
      reverse = n % 10;
      n /= 10;
      sum = sum * 10 + reverse;
    }
    cout<<sum;
	// Type your code here
	return 0;
}