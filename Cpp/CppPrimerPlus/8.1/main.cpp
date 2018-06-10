#include <iostream>

using namespace std;

void print(char *strings);
void print(char *strings,int n);

int main()
{
    char *temp="Hello World!";

    print(temp);
    cout<<endl;
    print(temp,5);

    return 0;
}

void print(char *strings)
{
    cout<<strings<<endl;
}

void print(char *strings,int n)
{
    for(int i=0;i<n;i++)
    {
        cout<<strings<<endl;
    }
}
