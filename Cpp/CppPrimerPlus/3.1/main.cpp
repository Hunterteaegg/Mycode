#include <iostream>

using namespace std;

int main()
{
    int height_foot;
    const int factor=12;

    cout << "Enter your height:";
    cin>>height_foot;
    cout<<"Your height is "<<height_foot/factor<<" foots, and "<<height_foot%factor<<" inches.";

    return 0;
}
