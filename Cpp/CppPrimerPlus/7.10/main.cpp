#include <iostream>

using namespace std;

double calculate(double a,double b,double (*fun)(double a1, double b1));

double add(double x,double y)
{
    return x+y;
}

int main()
{
    cout<<"The answer is "<<calculate(10,5,add);
    return 0;
}

double calculate(double a,double b,double (*fun)(double a1, double b1))
{
    return fun(a,b);
}
