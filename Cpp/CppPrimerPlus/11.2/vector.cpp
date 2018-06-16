#include "vector.h"
#include <cmath>

namespace VECTOR
{
    Vector::Vector()
    {
        Vector::x=Vector::y=0;
        Vector::mode=true;
    }

    Vector::Vector(double n1,double n2,bool m_mode)
    {
        Vector::mode=m_mode;

        if(m_mode==true)
        {
            Vector::x=n1;
            Vector::x=n2;
        }
        else
        {
            Vector::x=n1*std::cos(n2);
            Vector::y=n1*std::sin(n2);
        }
    }

    void Vector::reset(double n1,double n2,bool m_mode)
    {
        Vector::mode=m_mode;

        if(m_mode==true)
        {
            Vector::x=n1;
            Vector::x=n2;
        }
        else
        {
            Vector::x=n1*std::cos(n2);
            Vector::y=n1*std::sin(n2);
        }
    }

    double Vector::magval() const
    {
        return std::sqrt(std::pow(Vector::x,2)+std::pow(Vector::y,2));
    }

    double Vector::angval() const
    {
        return std::atan2(Vector::y,Vector::x);
    }
}
