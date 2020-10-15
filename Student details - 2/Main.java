#include<iostream>
#include <string>
using namespace std;
class Student{
  // Type your code here
  private:
  		int age, std;
  		string first_name, last_name;
  public:
  		int getage()
        {
          return age;
        }
  		string getfirstname()
        {
          return first_name;
        }
  		string getlastname()
        {
          return last_name;
        }
  		int getstandard()
        {
          return std;
        }
  		void setage(int a)
        {
          if(a < 6 || a > 17)
            age = 0;
          else
          	age = a;
        }
  		void setfirstname(string first)
        {
          first_name = first;
        }
  		void setlastname(string last)
        {
          last_name = last;
        }
  		void setstandard(int s)
        {
          if(s < 1 || s > 12)
          	std = 0;
          else
            std = s;
        }
  		//string to_string()
        //{
          //return (to_string(getage()) + ", " + getfirstname() + ", " + getlastname() + ", " + to_string(getstandard()));
        //}
};
int main(){
  // Type your code here
  Student s;
  int a, b, Age, STD;
  string first, last;
  cin>>a;
  cin>>first;
  cin>>last;
  cin>>b;
  s.setage(a);
  s.setfirstname(first);
  s.setlastname(last);
  s.setstandard(b);
  Age = s.getage();
  STD = s.getstandard();
  if(Age == 0 || STD == 0)
    cout<<"No Admission";
  else
  {
  	cout<<s.getage()<<"\n";
  	cout<<s.getlastname()<<", "<<s.getfirstname()<<"\n";
  	cout<<s.getstandard()<<"\n";
  	cout<<"\n";
  	cout<<s.getage()<<","<<s.getfirstname()<<","<<s.getlastname()<<","<<s.getstandard();
  	return 0;
  }
}