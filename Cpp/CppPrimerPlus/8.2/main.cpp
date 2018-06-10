#include <iostream>

using namespace std;

struct CandyBar
{
    char *brand;
    float height;
    int heat;
};

void setCandyBar(CandyBar &candybar,char *name,const double mass,const int heats);
void showCandyBar(const CandyBar &candybar);

int main()
{
    CandyBar candybar;
    setCandyBar(candybar,"SCAU",5.66,37);
    showCandyBar(candybar);

    return 0;
}

void setCandyBar(CandyBar &candybar,char *name,const double mass,const int heats)
{
    candybar.brand=name;
    candybar.heat=heats;
    candybar.height=mass;
}

void showCandyBar(const CandyBar &candybar)
{
    cout<<"The "<<candybar.brand<<" has "<<candybar.height<<" height and "<<candybar.heat<<" heat.";
}
