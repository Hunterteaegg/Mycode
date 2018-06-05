#include <iostream>
#include <cstring>
#include <string>

using namespace std;

int main()
{
    string done="done";
    int counter=0;
    char temp[20];

    cout<<"Enter words (to stop, type the word done):\n";

    cin>>temp;

    while(done!=temp)
    {
        counter++;
        cin>>temp;
    }
    cout<<"You entered a total of "<<counter<<" words.";

    return 0;
}
