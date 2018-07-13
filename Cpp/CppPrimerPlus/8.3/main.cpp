#include <iostream>
#include <string>
#include <cctype>

using namespace std;

string & convertUpper(string &charGroup);

int main()
{
    string temp;

    do
    {
        cout<<"Enter a string (q to quit):";
        getline(cin,temp);

        if(!cin.good()||temp=="q")
        {
            break;
        }
        cout<<convertUpper(temp)<<endl;
    }while(true);

    return 0;
}

string & convertUpper(string &charGroup)
{
    for(int i=0;i<sizeof(charGroup);i++)
    {
        if(islower(charGroup[i]))
        {
            charGroup[i]=toupper(charGroup[i]);
        }
    }

    return charGroup;
}
