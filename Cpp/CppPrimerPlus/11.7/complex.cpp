#include "complex.h"
#include <iostream>

Complex::Complex(double m_real,double m_imagination)
{
    real=m_real;
    imagination=m_imagination;
}

void Complex::reset(double m_real,double m_imagination)
{
    real=m_real;
    imagination=m_imagination;
}

Complex operator+(const Complex &a,const Complex &b)
{
    return Complex(a.real+b.real,a.imagination+b.imagination);
}

Complex operator-(const Complex &a,const Complex &b)
{
    return Complex(a.real-b.real,a.imagination-b.imagination);
}

Complex operator*(const Complex &a,const Complex &b)
{
    return Complex(a.real*b.real-a.imagination*b.imagination,a.real*b.imagination+a.imagination*b.real);
}

Complex operator*(const double &num,const Complex &a)
{
    return Complex(num*a.real,num*a.imagination);
}

Complex Complex::operator-()
{
    return Complex(-real,-imagination);
}

std::ostream & operator<<(std::ostream &os,const Complex &num)
{
    os<<"("<<num.real<<","<<num.imagination<<"i)";

    return os;
}

std::istream & operator>>(std::istream &os,Complex &num)
{
    double real,imagination;

    std::cin>>real>>imagination;

    num.reset(real,imagination);
    getchar();

    return os;
}
