#include <iostream>

using namespace std;

int main()
{
    float degrees,minutes,seconds;
    float total_degrees;

    cout << "Enter a latitude in degrees,minutes,and seconds:"<<endl;
    cout<<"First,enter the degrees:";
    cin>>degrees;
    cout<<"Next,enter the minutes of arc:";
    cin>>minutes;
    cout<<"Finally,enter the seconds of arc:";
    cin>>seconds;

    total_degrees=degrees+minutes/60+seconds/3600;

    cout<<degrees<<" degrees,"<<minutes<<" minutes,"<<seconds<<" seconds = "<<total_degrees<<" degrees";

    return 0;
}
