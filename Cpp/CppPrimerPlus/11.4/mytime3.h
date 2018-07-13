#ifndef MYTIME3_H_INCLUDED
#define MYTIME3_H_INCLUDED

#include <iostream>

class Time
{
private:
    int hours;
    int minutes;

public:
    Time();
    Time(int h,int m=0);
    void addMin(int m);
    void addHr(int h);
    void reset(int h=0,int m=0);

    friend Time operator+(const Time &a,const Time &b);
    friend Time operator-(const Time &a,const Time &b);
    friend Time operator*(const Time &a,double n);
    friend Time operator*(double n,const Time &a);
    friend std::ostream & operator<<(std::ostream &os,const Time &t);

};

#endif // MYTIME3_H_INCLUDED
