#include <iostream>

char show_menu();

int main()
{
    using namespace std;

    switch(show_menu())
    {
        case 'c':cout<<"carnivore"<<endl;break;
        case 'p':cout<<"pianist"<<endl;break;
        case 't':cout<<"tree"<<endl;break;
        case 'g':cout<<"game"<<endl;break;
        default:cout<<"No matching choice!"<<endl;
    }

    return 0;
}

char show_menu()
{
    using namespace std;

    ;
    char choice;

    cout<<"Please enter one of the following choices:"<<endl;
    cout<<"c) carnivore\t"<<"p) pianist"<<endl;
    cout<<"t) tree\t\t"<<"g) game"<<endl;

    cin>>choice;

    return choice;
}
