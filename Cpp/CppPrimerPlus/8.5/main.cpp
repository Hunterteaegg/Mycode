#include <iostream>

using namespace std;

const int length=5;

template <typename T>
T max5(T *numbers);

int main()
{
    int number[length]=
    {
        46,79,8989,1316,46,
    };
    cout<<max5(number)<<endl;

    double numbers[length]
    {
        2.1,3.6,2.3,8.9,7.5,
    };
    cout<<max5(numbers);

    return 0;
}

template <typename T>
T max5(T *numbers)
{
    T temp=numbers[0];

    for(int i=1;i<length;i++)
    {
        if(temp<numbers[i])
        {
            temp=numbers[i];
        }
    }

    return temp;
}
