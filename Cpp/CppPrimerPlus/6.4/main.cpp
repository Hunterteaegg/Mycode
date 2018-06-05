#include <iostream>

int main()
{
    float base=100.0;
    float Daphne_profit=base;
    float Cleo_profit=base;
    int year=1;

    do
    {
        Daphne_profit+=0.1*base*year;
        Cleo_profit+=0.05*Cleo_profit*year;
        year++;
    }
    while(Cleo_profit<Daphne_profit);

    std::cout<<"The total value is "<<Cleo_profit<<" "<<Daphne_profit<<" ,"<<year<<" years";

    return 0;
}
