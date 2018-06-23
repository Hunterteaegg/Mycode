#include <iostream>
#include "classic.h"
#include <cstring>

Classic::Classic(char *m_work,char *s1,char *s2,int n,double x)
{
    Cd(s1,s2,n,x);
    work=new char[strlen(m_work)+1];
    strcpy(work,m_work);
}

Classic::Classic(const Classic &c):Cd(c)
{
    work=new char[strlen(c.work)+1];
    strcpy(work,c.work);
}

Classic::Classic():Cd()
{
    work=new char[1];
    work[0]='\0';
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
    delete [] work;
}
