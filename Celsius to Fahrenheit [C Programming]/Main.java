#include <stdio.h>
float fahrenheit(float celsius);
float kelvin(float celsius);
int main()
{
    float celsius;
    scanf("%f",&celsius);
    printf("temperature in Fahrenheit %f\n", fahrenheit(celsius));
    printf("temperature in Kelvin %f", kelvin(celsius));
    return 0;
}
float fahrenheit(float celsius)
{
  return (((celsius / 5) * 9) + 32);
	//type your code here
}
float kelvin(float celsius)
{
  return (celsius + 273.149994);
	//type your code here
}
