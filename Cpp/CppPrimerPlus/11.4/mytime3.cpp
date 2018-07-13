#include "mytime3.h"
#include <iostream>

Time::Time()
{
    hours=minutes=0;
}

Time::Time(int h,int m)
{
    hours=h;
    minutes=m;
}

void Time::addMin(int m)
{
    minutes+=m;
    hours+=minutes/60;
    minutes%=60;
}

void Time::addHr(int h)
{
    hours+=h;
}

void Time::reset(int h,int m)
{
    hours=h;
    minutes=m;
}

Time operator+(const Time &a,const Time &b)
{
    return Time(a.hours+b.hours,a.minutes+b.minutes);
}

Time operator-(const Time &a,const Time &b)
{
    return Time(a.hours-b.hours,a.minutes-b.minutes);
}

Time operator*(const Time &a,double n)
{
    return Time(n*a.hours,n*a.minutes);
}

Time operator*(double n,const Time &a)
{
    return a*n;
}

std::ostream & operator<<(std::ostream &os,const Time &t)
{
    os<<t.hours<<":"<<t.minutes<<std::endl;

    return os;
}
