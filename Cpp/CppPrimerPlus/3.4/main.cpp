#include <iostream>

using namespace std;

int main()
{
    int day,hour,minute,second;
    int origin_second;

    cout<<"Enter the number of seconds:";
    cin>>second;
    origin_second=second;

    minute=second/60;
    second%=60;
    hour=minute/60;
    minute%=60;
    day=hour/24;
    hour%=24;

    cout<<origin_second<<" seconds = "<<day<<" days, "<<hour<<" hours, "<<minute<<" minutes, "<<second<<" seconds";

    return 0;
}
