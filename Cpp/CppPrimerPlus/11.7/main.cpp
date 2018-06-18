#include <iostream>
#include "complex.h"

using namespace std;

int main()
{
    Complex a(3.0,4.0);
    Complex c;
    cout<<"Enter a complex number (q to quit):\n";

    while(cin>>c)
    {
        cout<<"c is "<<c<<'\n';
        cout<<"complex conjugate is "<<-c<<'\n';
        cout<<"a is "<<a<<endl;
        cout<<"a+c is "<<a+c<<endl;
        cout<<"a-c is "<<a-c<<endl;
        cout<<"a*c is "<<a*c<<endl;
        cout<<"2*c is "<<2*c<<endl;
        cout<<"Enter a complex number (q to quit):"<<endl;
    }

    cout<<"Done!"<<endl;

    return 0;
}
