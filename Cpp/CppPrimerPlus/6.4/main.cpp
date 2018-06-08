#include <iostream>

#define strsize 20

using namespace std;

struct bop
{
    char fullname[strsize];
    char title[strsize];
    char bopname[strsize];
    int preference;
};

char show_menu()
{
    cout<<"a. display by name\t"<<"b. display by title"<<endl;
    cout<<"c. display by bopname\t"<<"d. display by preference"<<endl;
    cout<<"q. quit"<<endl;

    char choice;
    cin>>choice;

    return choice;
}

int main()
{

    show_menu();
    return 0;
}
