#include <iostream>

using namespace std;

int main()
{
    float a,b;

    while(cin>>a>>b&&a!=0&&b!=0)
    {
        cout<<"The average is "<<(2.0*a*b)/(a+b)<<endl;
    }

    return 0;
}
