#include <iostream>
#include <cstring>
#include <string>

using namespace std;

void strcount(string m_string);

int main()
{
    string temp;

    cout<<"Enter a line:"<<endl;
    getline(cin,temp);

    while(temp!="")
    {
        strcount(temp);
        cout<<"Enter next line (empty line to quit):"<<endl;
        getline(cin,temp);
    }

    cout<<"Bye!";

    return 0;
}

void strcount(string m_string)
{
    static int total=0;

    cout<<"\""<<m_string<<"\"contains ";
    total+=sizeof(string);
    cout<<sizeof(string)<<" characters"<<endl;
    cout<<total<<" characters total"<<endl;
}
