#include <iostream>
#include "classic.h"
#include <cstring>

Classic::Classic(std::string m_work,char *s1,char *s2,int n,double x)
{
    Cd(s1,s2,n,x);
    work=m_work;
}

Classic::Classic(const Classic &c):Cd(c)
{
    work=c.work;
}

Classic::Classic():Cd()
{
    work="";
}

void Classic::Report() const
{
    Cd::Report();
    std::cout<<" "<<work;
}

Classic Classic::operator=(const Classic &c)
{
    return Classic(c);
}

Classic::~Classic()
{
    ;
}
