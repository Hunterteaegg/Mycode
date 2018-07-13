#include <iostream>

using namespace std;

const int Seasons=4;
const char *Snames[Seasons]={
    "Spring","Summer","Fall","Winter",
};

void filling(double *pa);
void show(const double *pa);

int main()
{
    double expenses[Seasons];
    filling(expenses);
    show(expenses);

    return 0;
}

void filling(double *pa)
{
    for(int i=0;i<Seasons;i++)
    {
        cout<<"Enter "<<Snames[i]<<" expenses:";
        cin>>pa[i];
    }
}

void show(const double *pa)
{
    double total=0.0;
    cout<<"\nEXPENSES\n";
    for(int i=0;i<Seasons;i++)
    {
        cout<<Snames[i]<<":$"<<pa[i]<<endl;
        total+=pa[i];
    }
    cout<<"Total Expenses: $"<<total<<endl;
}
