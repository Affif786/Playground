#include<iostream>
using namespace std;
int main()
{
  int total_balls, total_runs, runs_scored, balls_bowled, overs_finished, remainder;
  double trr, over, net_over;
  float crr;
  cin>>total_balls;
  cin>>total_runs;
  cin>>runs_scored;
  cin>>balls_bowled;
  over = total_balls / 6;
  overs_finished = balls_bowled / 6;
  remainder = balls_bowled % 6;
  net_over = remainder / 10.0;
  net_over = overs_finished + net_over;
  trr = total_runs / over;
  crr = runs_scored / net_over;
  cout<<over<<endl;
  cout<<net_over<<endl;
  printf("%0.1f", crr);
  cout<<endl;
  printf("%0.1f", trr);
  cout<<endl;
  if(crr >= trr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  //Type your code here.
}