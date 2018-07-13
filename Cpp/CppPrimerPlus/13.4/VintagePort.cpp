#include <iostream>
#include "vintageport.h"
#include <cstring>

using namespace std;

VintagePort::VintagePort():Port()
{
    nickname=nullptr;
    year=0;
}

VintagePort::VintagePort(const char *br,int b,const char *nn,int y):Port(br,nullptr,b)
{
    strcpy(nickname,nn);
    year=y;
}

VintagePort::VintagePort(const VintagePort &vp):Port(vp)
{
    strcpy(nickname,vp.nickname);
    year=vp.year;
}

VintagePort & VintagePort::operator=(const VintagePort &vp)
{
    if(this==&vp)
    {
        return *this;
    }

    Port::operator=(vp);
    strcpy(nickname,vp.nickname);
    year=vp.year;

    return *this;
}

void VintagePort::Show() const
{
    Port::Show();
    std::cout<<" ";
    std::cout<<nickname<<" "<<year;
}

ostream & operator<<(ostream & os,const VintagePort &vp)
{
    os<<(const Port &)vp;
    os<<" "<<vp.nickname<<" "<<vp.year;

    return os;
}
