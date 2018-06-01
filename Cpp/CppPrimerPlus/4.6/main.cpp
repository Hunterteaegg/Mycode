#include <iostream>

struct CandyBar
{
    std::string brand;
    double weight;
    int heat;
};

int main()
{
    using namespace std;

    CandyBar snacks[3]=
    {
        {
            "fruit",
            20.5,
            300,
        },
        {
            "rice",
            35.6,
            989,
        },
        {
            "chicken",
            489.3,
            16,
        },
    };

    cout<<snacks[0].brand<<" "<<snacks[1].brand<<" "<<snacks[2].brand<<endl;
    cout<<snacks[0].heat<<" "<<snacks[1].heat<<" "<<snacks[2].heat<<endl;
    cout<<snacks[0].weight<<" "<<snacks[1].weight<<" "<<snacks[2].weight<<endl;

    return 0;
}
