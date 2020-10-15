#include<iostream>
#include <bits/stdc++.h>
using namespace std;
class Book{
  	private:
  			string book_name, ISBN, publisher;
  			double price;
  			int number_customers;
  	public:
  			void setBookName(string bk)
            {
              book_name = bk;
            }
  			void setISBN(string isbn)
            {
              ISBN = isbn;
            }
  			void setPublisher(string pub)
            {
              publisher = pub;
            }
  			void setPrice(double p)
            {
              price = p;
            }
  			void setNumberCustomer(int n)
            {
              number_customers = n;
            }
  			string getBookName()
            {
              return book_name;
            }
  			string getISBN()
            {
              return ISBN;
            }
  			string getPublisher()
            {
              return publisher;
            }
  			double getPrice()
            {
              return price;
            }
  			int getNumberCustomer()
            {
              return number_customers;
            }   
	// Type your code here
};
class Customer : public Book{
  	private:
  			string custName, custType;
  	public:
  			string getCustName()
            {
              return custName;
            }
  			void setCustName(string cn)
            {
              custName = cn;
            }
  			string getCustType()
            {
              return custType;
            }
  			void setCustType(string ct)
            {
              custType = ct;
            }
};
int main()
{
  	Customer c;
  	string bk, isbn, pub;
  	double price, sum = 0;
  	int n;
  	cin>>bk;
  	cin>>isbn;
  	cin>>pub;
  	cin>>price;
    cin>>n;
  	vector<string> person;
  	vector<string> type;
  	vector<double> amount;
  	for(int i = 0; i < n; i++)
    {
      string name, T;
      cin>>name;
      cin>>T;
      person.push_back(name);
      type.push_back(T);
    }
    //cout<<type[i];
  	c.setBookName(bk);
  	c.setISBN(isbn);
  	c.setPrice(price);
  	//cout<<c.getPrice();
  	c.setPublisher(pub);
  	c.setNumberCustomer(n);
  	for(int i = 0; i < n; i++)
    {
       if(type[i] == "S")
       {
         double temp;
         temp = c.getPrice() - ((50 * c.getPrice()) / 100);
         //cout<<temp<<"\n";
         amount.push_back(temp);
       }
       else if(type[i] == "F")
       {
         double temp;
         temp = c.getPrice() - ((75 * c.getPrice()) / 100);
         amount.push_back(temp);
       }
       else
       {
         double temp;
         temp = c.getPrice() - ((90 * c.getPrice()) / 100);
         amount.push_back(temp);
       }
    }
  	//cout<<amount[0];
  		cout<<"Name of the book"<<"\n";
  		cout<<"ISBN Number"<<"\n";
  		cout<<"Publisher name"<<"\n";
  		cout<<"Price of a book"<<"\n";
  		cout<<"Number of Customers"<<"\n";
  	for(int i = 0; i < n; i++)
    {
  		cout<<"Details for Customer "<<i + 1<<"\n";
  		cout<<"Name"<<"\n";
  		cout<<"Type of Customer (S or I or F)"<<"\n";
  	//cout<<"Details for Customer 2"<<"\n";
  	//cout<<"Name"<<"\n";
  	//cout<<"Type of Customer (S or I or F)"<<"\n";
  	//cout<<"Details for Customer 3"<<"\n";
  	//cout<<"Name"<<"\n";
  	//cout<<"Type of Customer (S or I or F)"<<"\n";
    }
  	for(int i = 0; i < n; i++)
      sum = sum + amount[i];
  	cout<<"Total Amount Received :"<<sum;
  	//cout<<c.totalAmount(obj);
  	
  	
		// Type your code here
  		return 0;
}