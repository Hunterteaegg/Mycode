#include <iostream>
#include <cstring>

using namespace std;

int main()
{
    char done[]="done";
    int counter=0;
    char temp[20];

    cout<<"Enter words (to stop, type the word done):\n";

    cin>>temp;

    while(strcmp(temp,done)!=0)
    {
        counter++;
        cin>>temp;
    }
    cout<<"You entered a total of "<<counter<<" words.";

    return 0;
}
