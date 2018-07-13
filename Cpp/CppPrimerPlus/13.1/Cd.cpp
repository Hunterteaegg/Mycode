#include "cd.h"
#include <cstring>
#include <iostream>

Cd::Cd(char *s1,char *s2,int n,double x)
{
    strcpy(performers,s1);
    strcpy(label,s2);
    selections=n;
    playtime=x;
}

Cd::Cd(const Cd &d)
{
    strcpy(performers,d.performers);
    strcpy(label,d.label);
    selections=d.selections;
    playtime=d.playtime;
}

Cd::Cd()
{
    performers[0]=label[0]='\0';
    selections=0;
    playtime=0;
}

Cd::~Cd()
{
    ;
}

void Cd::Report() const
{
    std::cout<<performers<<" "<<label<<" "<<selections<<" "<<playtime;
}

Cd Cd::operator=(const Cd &d)
{
    return Cd(d);
}
