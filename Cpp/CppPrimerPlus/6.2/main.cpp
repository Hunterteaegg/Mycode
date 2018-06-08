#include <iostream>

using namespace std;

int main()
{
    double arrays[10]={};
    double temp;

    int i=0;

    do
    {
        cin>>temp;
        if(cin.fail())
        {
            break;
        }
        arrays[i]=temp;
        ++i;
    }while(i<10);

    for(int i=0;i<10;i++)
    {
        cout<<arrays[i]<<" ";
    }

    return 0;
}
