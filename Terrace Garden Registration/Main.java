#include<iostream>
using namespace std;

class Customer
{
  public:
  		string name, Address, contact, Email, proof_type, proof_id;
  		void setname(string n)
        {
          name = n;
        }
  		void setAddress(string add)
        {
          Address = add;
        }
  		void setcontact(string c)
        {
          contact = c;
        }
  		void setEmail(string e)
        {
          Email = e;
        }
  		void setproofType(string p)
        {
          proof_type = p;
        }
  		void setproofId(string pd)
        {
          proof_id = pd;
        }
  		string getname()
        {
          return name;
        }
  		string getAddress()
        {
          	return Address;
        }
  		string getContact()
        {
          return contact;
        }
  		string getEmail()
        {
          	return Email;
        }
  		string getProofType()
        {
          return proof_type;
        }
  		string getProofID()
        {
          return proof_id;
        }
	// Type your code here
};
int main()
{
  	Customer c;
  	string name, address, contact, Email, proof_type, proof_id;
  	cin>>name;
  	cin>>address;
  	cin>>contact;
  	cin>>Email;
  	cin>>proof_type;
  	cin>>proof_id;
  	c.setname(name);
  	c.setAddress(address);
  	c.setcontact(contact);
  	c.setEmail(Email);
  	c.setproofType(proof_type);
  	c.setproofId(proof_id);
  	cout<<"Registration"<<"\n";
  	cout<<"Enter your name"<<"\n";
  	cout<<"Enter your address"<<"\n";
  	cout<<"Contact Number"<<"\n";
  	cout<<"E-Mail ID"<<"\n";
  	cout<<"Enter proof type"<<"\n";
  	cout<<"Enter proof id"<<"\n";
  	cout<<"Customer Details"<<"\n";
  	cout<<c.getname()<<"\n";
  	cout<<c.getAddress()<<"\n";
  	cout<<c.getContact()<<"\n";
  	cout<<c.getEmail()<<"\n";
  	cout<<c.getProofType()<<"\n";
  	cout<<c.getProofID()<<"\n";
  	cout<<"Thank you for registering. Your id is 1...";
  	
    // Type your code here
    return 0;
}