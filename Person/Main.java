#include<iostream>
using namespace std;
class Person{
  	private:
  			string first_name, last_name;
  			int age;
  	public:
  			string getFirstName()
            {
              return first_name;
            }
  			string getLastName()
            {
              return last_name;
            }
  			int getAge()
            {
              return age;
            }
  			void setFirstName(string first_name)
            {
              this->first_name = first_name;
            }
  			void setLastName(string last_name)
            {
              this->last_name = last_name;
            }
  			void setAge(int age)
            {
              if(age < 0 || age > 100)
                this->age = 0;
              else
                this->age = age;
            }
  			bool isTeen()
            {
              if(this->age > 12 && this->age < 20)
                return true;
              else
                return false;
            }
  			string getFullName()
            {
              string full_name = last_name + " " + first_name;
              return full_name;
            }	
	// Type your code here
};
int main(){
  	string f, l;
  	int age;
  	cin>>l;
  	cin>>f;
  	cin>>age;
  	Person p;
  	p.setFirstName(f);
  	p.setLastName(l);
  	p.setAge(age);
  	cout<<"First Name: "<<p.getFirstName()<<"\n";
  	cout<<"Last Name: "<<p.getLastName()<<"\n";
  	cout<<"Age: "<<p.getAge()<<"\n";
  	cout<<"Full Name: "<<p.getFullName()<<"\n";
  	if(p.isTeen())
      cout<<"isTeen: True"<<"\n";
  	else
      cout<<"is Teen: False"<<"\n";
	// Type your code here
}