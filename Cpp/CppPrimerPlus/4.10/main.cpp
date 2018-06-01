#include <iostream>
#include <array>

int main()
{
    using namespace std;

    array<int,3> myarray;
    myarray[0]=5;
    myarray[1]=23;
    myarray[2]=96;

    cout<<"The average is "<<(float)(myarray[0]+myarray[1]+myarray[2])/3<<endl;

    return 0;
}
