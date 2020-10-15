#include <iostream>
using namespace std;
class Calculation
{
  public:
  	float speedconversion(float x)
  	{
      	//cout<<x;
      	//cout<<x * (5.0 / 18.0);
    	return ((x * 5.0) / 18.0);
  	}
  	int length_of_train(float y, int z)
  	{
    	return (y * z);
  	}
    // Type your code here
};
int main() {
    Calculation c;
  	int time, result;
  	float speed, sp_m;
    cin>>speed;
  	cin>>time;
  	sp_m = c.speedconversion(speed);
  	//cout<<sp_m;
  	result = c.length_of_train(sp_m, time);
  	cout<<"The length of train is "<<result<<" meter";
  // Type your code here
  return 0;
}