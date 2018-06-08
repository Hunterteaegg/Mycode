#include <iostream>

using namespace std;

int main()
{
    float income=0,fax=0;

    do
    {
        cout<<"Enter your income:";
        cin>>income;

        if(cin.fail()||income<0)
        {
            break;
        }

        if(income<=5000)
        {
            fax=0;
        }
        else if(income>5000&&income<=15000)
        {
            fax=(income-5000)*0.1;
        }
        else if(income>15000&&income<=35000)
        {
            fax=(15000-5000)*0.1+(income-15000)*0.15;
        }
        else
        {
            fax=10000*0.1+20000*0.15+(income-35000)*0.2;
        }

        cout<<"The fax is "<<fax<<endl;

    }while(true);

    cout<<"Bye!";

    return 0;
}
