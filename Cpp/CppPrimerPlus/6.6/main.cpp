#include <iostream>
#include <string>

struct Member
{
    std::string name;
    double bill;
};

int main()
{
    using namespace std;

    int number;

    cout<<"Enter the number:";
    cin>>number;

    Member* mem_pointer[number];

    for(int i=0;i<number;i++)
    {
        mem_pointer[i]=new Member;

        cout<<"Enter the name:";
        cin>>mem_pointer[i]->name;
        getchar();

        cout<<"Enter the bill:";
        cin>>mem_pointer[i]->bill;
        getchar();
    }

    for(int i=0;i<number;i++)
    {
        cout<<mem_pointer[i]->name<<" "<<mem_pointer[i]->bill<<endl;
    }

    return 0;
}
