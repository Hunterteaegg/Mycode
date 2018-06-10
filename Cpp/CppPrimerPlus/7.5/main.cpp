#include <iostream>

using namespace std;

int resur(int num);

int main()
{
    cout <<"The 10! is "<<resur(10);

    return 0;
}

int resur(int num)
{
    if(num==0)
    {
        return 1;
    }

    return num*resur(num-1);
}
