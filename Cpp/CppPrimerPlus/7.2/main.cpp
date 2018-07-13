#include <iostream>

using namespace std;

int main()
{
    int score[10];
    int i=0;
    float sum=0;
    float average=0;

    cout<<"Enter no more 10 scores:";

    do
    {
        cin>>score[i++];
    }while(cin.good());

    for(int j=0;j<i;j++)
    {
        sum+=score[j];
    }
    average=sum/(i+1);

    cout<<"The average is "<<average;

    return 0;
}
