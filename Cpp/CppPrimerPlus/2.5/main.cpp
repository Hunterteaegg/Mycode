#include <iostream>

extern double transform(double cel);

int main()
{
    double cel;

    std::cout<<"Please enter a Celsius value:";
    std::cin>>cel;
    std::cout<<cel<<" degrees Celsius is "<<transform(cel)<<" degrees Fahrenheit";

    return 0;
}
