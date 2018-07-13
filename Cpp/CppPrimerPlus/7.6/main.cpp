#include <iostream>
#include <algorithm>

using namespace std;

int Fill_array(double *arrays,int length);
void Show_array(const double *arrays,int length);
void Reverse_array(double *arrays,int length);

int main()
{
    double arrays[10];

    cout<<"Enter ten numbers:";
    Fill_array(arrays,10);
    Show_array(arrays,10);
    cout<<endl;
    Reverse_array(arrays+1,8);
    Show_array(arrays+1,8);

    return 0;
}

int Fill_array(double *arrays,int length)
{
    int counter=0;
    double input;

    while(counter<length&&cin>>input)
    {
        arrays[counter++]=input;
    }

    return counter;
}

void Show_array(const double *arrays,int length)
{
    for(int i=0;i<length;i++)
    {
        cout<<arrays[i]<<" ";
    }
}

void Reverse_array(double *arrays,int length)
{
    double new_arrays[length];

    for(int i=0;i<length;i++)
    {
        new_arrays[i]=arrays[i];
    }
    for(int i=0;i<length;i++)
    {
        arrays[i]=new_arrays[length-i-1];
    }
    ;
}
