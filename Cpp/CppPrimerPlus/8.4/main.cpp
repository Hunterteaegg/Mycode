#include <iostream>
#include <cstring>

using namespace std;

struct stringy
{
    char *str;
    int ct;
};

void set(stringy &newString,char *n);
void show(const stringy &newString);
void show(const stringy &newString,int n);
void show(const char *newString);
void show(const char *newString,int n);

int main()
{
    stringy beany;
    char testing[]="Reality isn't what it used to be.";

    set(beany,testing);
    show(beany);
    show(beany,2);
    testing[0]='D';
    testing[1]='u';
    show(testing);
    show(testing,3);
    show("Done!");

    return 0;
}

void set(stringy &newString,char *n)
{
    newString.str=n;
    newString.ct=sizeof(*n);
}

void show(const stringy &newString)
{
    cout<<newString.str<<endl;
}

void show(const stringy &newString,int n)
{
    for(int i=0;i<n;i++)
    {
        show(newString);
    }
}

void show(const char *newString)
{
    cout<<newString<<endl;
}

void show(const char *newString,int n)
{
    for(int i=0;i<n;i++)
    {
        show(newString);
    }
}
