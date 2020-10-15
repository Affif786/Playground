#include<iostream>
using namespace std;
class Floor {
  	private:
  			double width, length;
  	public:
  			Floor(double w, double l)
            {
              if(w < 0)
                width = 0;
              else
                width = w;
              if(l < 0)
                length = 0;
              else
                length = l;
            }
  			double getArea()
            {
              return (width * length);
            }
     // Type your code here
};
class Carpet {
  	private:
  			double cost;
  	public:
  			Carpet(double c)
            {
              if(c < 0)
                cost = 0;
              else
                cost = c;
            }
  			double getCost()
            {
              return cost;
            }
    // Type your code here
};
int main(){
  		double length, width, cost, totalCost;
  		cin>>cost;
  		cin>>length;
  		cin>>width;
  		Floor f(width, length);
  		Carpet c(cost);
  		totalCost = f.getArea() * c.getCost();
  		cout<<totalCost;
	// Type your code here
}