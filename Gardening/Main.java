#include<iostream>
using namespace std;
int main()
{
  int rows, columns, tree_number;
  cin>>rows;
  cin>>columns;
  cin>>tree_number;
  if(rows + columns == tree_number || (rows + columns) * 2 == tree_number)
  {
    cout<<"It is a mango tree";
  }
  else
    cout<<"It is not a mango tree";
  //Type your code here.
}