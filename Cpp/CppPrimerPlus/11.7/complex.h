#ifndef COMPLEX_H_INCLUDED
#define COMPLEX_H_INCLUDED

#include <iostream>

class Complex
{
private:
    double real,imagination;

public:
    Complex(double m_real=0,double m_imagination=0);

    void reset(double m_real=0,double m_imagination=0);

    friend Complex operator+(const Complex &a,const Complex &b);
    friend Complex operator-(const Complex &a,const Complex &b);
    friend Complex operator*(const Complex &a,const Complex &b);
    friend Complex operator*(const double &num,const Complex &a);
    Complex operator-();

    friend std::ostream & operator<<(std::ostream &os,const Complex &num);
    friend std::istream & operator>>(std::istream &os,Complex &num);
};

#endif // COMPLEX_H_INCLUDED
