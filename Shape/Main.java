#include<iostream>
#include<cmath>
using namespace std;

class Shape
{
  float radius_c, radius_s, length, breadth, height, height_r;
  public:
  		Shape()
        {}
  		Shape(float r, float h)
        {
          radius_c = r;
          height = h;
        }
  		Shape(float r)
        {
          radius_s = r;
        }
  		Shape(float l, float b, float h)
        {
          length = l;
          breadth = b;
          height_r = h;
        }
  		float calculateAreaOfCylinder()
        {
          return (2 * 3.14 * radius_c * height + 2 * 3.14 * radius_c * radius_c);
        }
  		float calculateAreaOfSphere()
        {
          return (4 * 3.14 * radius_s * radius_s);
        }
  		float calculateAreaOfRectangle()
        {
          return (length + breadth + height_r);
        }
	// Type your code here
};
int main()
{
  	int n;
  	cin>>n;
  	double r, l, b, h, h_r, r_s;
  	//Shape s;
  	cout<<"1.Cylinder"<<"\n";
  	cout<<"2.Sphere"<<"\n";
  	cout<<"3.Rectangular prism"<<"\n";
  	cout<<"Enter the choice"<<"\n";
  	switch(n)
    {
      case 1:
        {
        	cin>>r;
        	cin>>h;
        	Shape s(r, h);
        	cout<<"Area of Cylinder is "<<s.calculateAreaOfCylinder();
        }
        	break;
      case 2:
        {
        	cin>>r_s;
        	Shape s(r_s);
        	cout<<"Area of Sphere is "<<s.calculateAreaOfSphere();
        }
        	break;
      case 3:
        {
        	cin>>l;
        	cin>>b;
        	cin>>h_r;
        	Shape s(l, b, h_r);
        	cout<<"Area of Rectangular prism is "<<s.calculateAreaOfRectangle();
        }
    };
  	
	// Type your code here
}