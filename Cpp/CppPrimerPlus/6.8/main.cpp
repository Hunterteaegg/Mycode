#include <iostream>
#include <fstream>

using namespace std;

int main()
{
    int counter=0;
    char ch;

    ifstream input;
    input.open("text.txt");

    if(input.good())
    {
        while((ch=input.get())!=EOF)
        {
            counter++;
        }
    }

    cout<<"The number is "<<counter;

    return 0;
}
