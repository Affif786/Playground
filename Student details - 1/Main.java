#include<iostream>
#include <string>
using namespace std;

class Student
{
  public:
  	int age, standard;
  	string first_name, last_name;
};
  
int main(){
  // Type your code here
  Student s1;
  cin>>s1.age;
  cin>>s1.first_name;
  cin>>s1.last_name;
  cin>>s1.standard;
  cout<<s1.age<<" "<<s1.first_name<<" "<<s1.last_name<<" "<<s1.standard<<endl;
}