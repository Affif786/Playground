#include<iostream>
using namespace std;
class complex
{
  	private:
  			int real, img;
  	public:
  		complex(int x, int y)
        {
          real = x;
          img = y;
        }
  		complex()
        {}
  		friend void addComplex(complex c1, complex c2);
	// Type your code here
};
void addComplex(complex c1, complex c2)
{
  complex c3;
  c3.real = c1.real + c2.real;
  c3.img = c1.img + c2.img;
  cout<<c3.real<<"+"<<"i"<<c3.img;
}
int main()
{
  int real1, real2, img1, img2;
  cin>>real1>>img1;
  cin>>real2>>img2;
  complex c1(real1, img1), c2(real2, img2);
  addComplex(c1, c2);
	// Type your code here
	return 0;
}