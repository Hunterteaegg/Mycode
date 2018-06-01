#include <iostream>

struct CandyBar
{
    std::string brand;
    float weight;
    int heat;
};

int main()
{
    using namespace std;

    CandyBar snack=
    {
        "Mocha Munch",
        2.3,
        350,
    };

    cout<<"The snack's information:"<<snack.brand<<" "<<snack.weight<<" "<<snack.heat;

    return 0;
}
