#include <iostream>
#include <cstring>

using namespace std;

template<typename T>
T maxn(T *numbers,int n);

template <> char *maxn(char **numbers,int n);

int main()
{
    int numbers[3]=
    {
        1,5,3,
    };
    char *sentence[15]=
    {
        "Hello",
        "Good Night",
        "My name",
    };
    cout<<maxn(numbers,3)<<endl;
    cout<<maxn(sentence,3);

    return 0;
}

template<typename T>
T maxn(T *numbers,int n)
{
    T temp=numbers[0];

    for(int i=1;i<n;i++)
    {
        if(temp<numbers[i])
        {
            temp=numbers[i];
        }
    }

    return temp;
}

template <> char *maxn(char **numbers,int n)
{
    char *temp=numbers[0];

    for(int i=1;i<n;i++)
    {
        if(strlen(temp)<strlen(numbers[i]))
        {
            temp=numbers[i];
        }
    }

    return temp;
}
