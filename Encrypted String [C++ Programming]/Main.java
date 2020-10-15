#include<iostream>
using namespace std;

char* encryption(char* str);
int main()
{
    char str[]="zebra tiger";
    printf("%s",encryption(str));
    return 0;
}
char* encryption(char* str)
{
  int len, i, sub, temp, end, start = 0;
  for(len = 0; str[len] != '\0'; len++);
  for(i = 0; i <= len; i++)
  {
    if(str[i] == ' ' || str[i] == '\0')
    {
      end = i - 1;
      temp = start;
      sub = end - start + 1;
      do
      {
        str[temp] = (str[temp] + --sub - 'a') % 26 + 'a';
        temp++;
      }while(temp <= end);
        start = i + 1;
    }
  }
  return str;
   //Type your code here
}

