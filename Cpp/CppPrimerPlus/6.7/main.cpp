#include <iostream>

using namespace std;

struct Car
{
    string producer;
    int year=0;
};

int main()
{
    int num=0;

    cout<<"How many cars do you wish to catalog?";
    cin>>num;
    getchar();

    Car *cars=new Car[num];

    for(int i=0;i<num;i++)
    {

        cout<<"Car #"<<i+1<<endl;
        cout<<"Please enter the make:";
        getline(cin,cars[i].producer);
        cout<<"Please enter the year made:";
        cin>>cars[i].year;
        getchar();

    }

    cout<<"Here is your collection:"<<endl;

    for(int i=0;i<num;i++)
    {
        cout<<cars[i].year<<" "<<cars[i].producer<<endl;
    }

    return 0;
}
