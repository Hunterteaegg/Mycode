#include <iostream>

using namespace std;

int main()
{
    float EU_per;

    cout<<"Enter EU gas consume rate:";
    cin>>EU_per;
    cout<<"The US_per is "<<(double)(62.14/(EU_per/3.875));

    return 0;
}
