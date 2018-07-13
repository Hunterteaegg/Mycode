#include <iostream>
#include <new>

using namespace std;

struct chaff
{
    char dross[20];
    int slag;
};

char buffer[2*sizeof(chaff)];

int main()
{
    chaff *chaff_one=new(buffer) chaff;
    chaff *chaff_two=new(buffer+sizeof(chaff)) chaff;

    chaff_one->slag=5;
    chaff_two->slag=10;

    cout<<chaff_one->slag<<" "<<chaff_two->slag;

    return 0;
}
