#include "cd.h"
#include <cstring>
#include <iostream>

Cd::Cd(char *s1,char *s2,int n,double x)
{
    performers=new char[strlen(s1)+1];
    strcpy(performers,s1);
    label=new char[strlen(s2)+1];
    strcpy(label,s2);
    selections=n;
    playtime=x;
}

Cd::Cd(const Cd &d)
{
    Cd(d.performers,d.label,d.selections,d.playtime);
}

Cd::Cd()
{
    performers=new char[1];
    label=new char[1];
    performers[0]='\0';
    label[0]='\0';
    selections=0;
    playtime=0;
}

Cd::~Cd()
{
    delete [] label;
    delete [] performers;
}

void Cd::Report() const
{
    std::cout<<performers<<" "<<label<<" "<<selections<<" "<<playtime;
}

Cd Cd::operator=(const Cd &d)
{
    return Cd(d);
}
