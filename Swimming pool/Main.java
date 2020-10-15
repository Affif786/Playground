#include<iostream>
using namespace std;
class Rectangle{
  	private:
  			double length, width;
  	public:
  		Rectangle(double l, double w)
        {
          if(l < 0)
            length = 0;
          else
            length = l;
          if(w < 0)
            width = 0;
          else
            width = w;
        }
  		double getWidth()
        {
          return width;
        }
  		double getLength()
        {
          return length;
        }
  		double getArea()
        {
          return (length * width);
        }
	// Type your code here
};
class Cuboid : public Rectangle
{
	private:
    		double height;
    public:
    	Cuboid(double l, double w, double h)
        :Rectangle(l, w)
        {
        	height = h;
        }
        double getHeight()
        {
        	return height;
        }
        double getVolume()
        {
        	return (Rectangle::getArea() * height);
        }
	// Type your code here
};
int main(){
  	double l, w, h;
  	cin>>w;
  	cin>>l;
  	cin>>h;
  	Rectangle r(l, w);
  	Cuboid c(l, w, h);
  	cout<<"Rectangle width: "<<r.getWidth()<<"\n";
  	cout<<"Rectangle length: "<<r.getLength()<<"\n";
  	cout<<"Rectangle area: "<<r.getArea()<<"\n";
  	cout<<"Cuboid width: "<<r.getWidth()<<"\n";
  	cout<<"Cuboid length: "<<r.getLength()<<"\n";
  	cout<<"Cuboid height: "<<c.getHeight()<<"\n";
  	cout<<"Cuboid volume: "<<c.getVolume()<<"\n";
	// Type your code here
	return 0;
}