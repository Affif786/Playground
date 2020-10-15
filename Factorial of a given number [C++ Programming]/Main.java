#include<bits/stdc++.h>
using namespace std;

int main()
{ 
long long int fact = 1; 
  int n, i;
cin>>n;

for(i =1; i <= n; i++)
{
     fact = fact * i;
}

cout<<fact;
return 0;
}
