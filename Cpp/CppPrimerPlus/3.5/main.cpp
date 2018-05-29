#include <iostream>

using namespace std;

int main()
{
    long long worldPopulation,USPopulation;
    double rate;

    cout<<"Enter the world's population:";
    cin>>worldPopulation;
    cout<<"Enter the population of the US:";
    cin>>USPopulation;
    rate=((long double)USPopulation/(long double)worldPopulation)*100;
    cout<<"The population of the US is "<<rate<<"% of the world population.";

    return 0;
}
