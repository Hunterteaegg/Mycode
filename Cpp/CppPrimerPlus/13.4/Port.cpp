#include "port.h"
#include <iostream>
#include <cstring>

Port::Port(const char *br,const char *st,int b)
{
    strcpy(brand,br);
    strcpy(style,st);
    bottles=b;
}

Port::Port(const Port &p)
{
    strcpy(brand,p.brand);
    strcpy(style,p.style);
    bottles=p.bottles;
}

Port & Port::operator=(const Port &p)
{
    if(&p==this)
    {
        return *this;
    }

    strcpy(brand,p.brand);
    strcpy(style,p.style);
    bottles=p.bottles;

    return *this;
}

Port & Port::operator+=(int b)
{
    bottles+=b;

    return *this;
}

Port & Port::operator-=(int b)
{
    bottles-=b;

    return *this;
}

void Port::Show() const
{
    std::cout<<"Brand:"<<brand<<std::endl;
    std::cout<<"Kind:"<<style<<std::endl;
    std::cout<<"Bottles"<<bottles<<std::endl;
}

std::ostream & operator<<(std::ostream & os,const Port &p)
{
    os<<p.brand<<","<<p.style<<","<<p.bottles;

    return os;
}
