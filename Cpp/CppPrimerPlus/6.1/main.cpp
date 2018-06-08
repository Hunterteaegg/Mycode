#include <iostream>
#include <cctype>

using namespace std;

int main()
{
    char temp;

    cout<<"Enter a sentence:";

    while(cin.get(temp)&&temp!='@')
    {
        if(isalpha(temp))
        {
            if(isupper(temp))
            {
                cout<<char(tolower(temp));
            }
            else if(islower(temp))
            {
                cout<<char(toupper(temp));
            }
        }
        else
        {
            cout<<temp;
        }
    }

    return 0;
}
