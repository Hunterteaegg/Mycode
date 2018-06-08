#include <iostream>

using namespace std;

int main()
{
    char temp;
    int counter=1;

    cout<<"Enter words (q to quit):"<<endl;

    while((temp=cin.get())!='q')
    {
        if(temp==' ')
        {
            ++counter;
        }
    }
    return 0;
}
