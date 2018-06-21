#include "cow.h"
#include <cstring>
#include <iostream>

Cow::Cow()
{
    name[0]='\0';
    hobby=nullptr;
    weight=0;
}

Cow::Cow(const char *nm,const char *ho,double wt)
{
    strcpy(name,nm);
    hobby=new char[sizeof(*ho)+1];
    *hobby=*ho;
    weight=wt;
}

Cow::Cow(const Cow &c)
{
    for(int i=0;i<20;i++)
    {
        name[i]=c.name[i];
    }
    hobby=new char[sizeof(*c.hobby)+1];
    *hobby=*c.hobby;
    weight=c.weight;
}

Cow::~Cow()
{
    delete hobby;
}

const Cow & Cow::operator=(const Cow &c)
{
    return c;
}

void Cow::showCow() const
{
    std::cout<<name<<" "<<hobby<<" "<<weight<<std::endl;
}
