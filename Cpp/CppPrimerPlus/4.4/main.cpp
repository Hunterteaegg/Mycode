#include <iostream>

int main()
{
    using namespace std;

    string first_name;
    string last_name;

    cout<<"Enter your first name:";
    getline(cin,first_name);
    cout<<"Enter you last name:";
    getline(cin,last_name);
    cout<<"Here's the information in a single string:"<<first_name<<" "<<last_name;

    return 0;
}
