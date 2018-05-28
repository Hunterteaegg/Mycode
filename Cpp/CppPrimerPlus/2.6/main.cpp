#include <iostream>

using namespace std;

double transform(double lightYears);

int main()
{
    double lightYears;

    cout << "Enter the number of light years:";
    cin>>lightYears;
    cout<<lightYears<<" light years = "<<transform(lightYears)<<" astronomical units";

    return 0;
}

double transform(double lightYears)
{
    return lightYears*63240;
}
