#include<iostream>
using namespace std;
class Student{
  // Type your code here
  public:
  		int marks[5];
  		void input()
        {
          int a, b, c, d, e;
          cin>>a>>b>>c>>d>>e;
          marks[0] = a;
          marks[1] = b;
          marks[2] = c;
          marks[3] = d;
          marks[4] = e;
        }
  		int calculateTotalScore()
        {
          int i, sum = 0;
          for(i = 0; i < 5; i++)
            sum += marks[i];
          return sum;
        }
};
int main(){
  int n, sara_marks, count = 0;
  cin>>n;
  //cin>>a>>b>>c>>d>>e;
  Student s[n];
  int result[n];
  // Type your code here
  for(int i = 0; i < n; i++)
  {
    s[i].input();
    result[i] = s[i].calculateTotalScore();
  }
  sara_marks = result[0];
  for(int i = 0; i < n; i++)
  {
    if(result[i] > sara_marks)
      count++;
  }
  cout<<count;
  return 0;
}