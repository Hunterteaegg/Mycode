#include <iostream>

int main()
{
    using namespace std;

    int temp;
    int result=0;
    int formal_result=0;

    do
    {
        formal_result=result;
        cin>>temp;
        result+=temp;
    }
    while(formal_result!=result);

    cout<<"The result is "<<result;

    return 0;
}
