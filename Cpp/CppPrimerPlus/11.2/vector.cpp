#include "vector.h"
#include <cmath>

namespace VECTOR
{
    Vector::Vector()
    {
       this->mode=true;
       this->x=this->y=0;
    }

    Vector::Vector(double n1,double n2,bool m_mode)
    {
        this->mode=m_mode;

        if(m_mode==true)
        {
            this->x=n1;
            this->y=n2;
        }
        else
        {
            this->x=n1*std::cos(n2);
            this->y=n1*std::sin(n2);
        }
    }

    void Vector::reset(double n1,double n2,bool m_mode)
    {
        this->mode=m_mode;

        if(m_mode==true)
        {
            this->x=n1;
            this->y=n2;
        }
        else
        {
            this->x=n1*std::cos(n2);
            this->y=n1*std::sin(n2);
        }
    }

    double Vector::magval() const
    {
        return std::sqrt(std::pow(this->x,2)+std::pow(this->y,2));
    }

    double Vector::angval() const
    {
        return std::atan2(Vector::y,Vector::x);
    }

    void Vector::polar_mode()
    {
        this->mode=false;
    }

    void Vector::rect_mode()
    {
        this->mode=true;
    }

    Vector Vector::operator+(const Vector &b) const
    {
        return Vector(this->x+b.x,this->y+b.y,true);
    }

    Vector Vector::operator-(const Vector &b) const
    {
        return Vector(this->x-b.x,this->y-b.y,true);
    }

    Vector Vector::operator-() const
    {
        return Vector(-this->x,-this->y,true);
    }

    Vector Vector::operator*(double n) const
    {
        return Vector(this->x*n,this->y*n,true);
    }

    Vector operator*(double n,const Vector &a)
    {
        return a*n;
    }

    std::ostream & operator<<(std::ostream &os,const Vector &v)
    {
        if(v.mode)
        {
            os<<"(x,y)=("<<v.x<<","<<v.y<<")";
        }
        else
        {
            os<<"(m,a)=("<<v.magval()<<","<<v.angval()<<")";
        }

        return os;
    }

    Vector::~Vector()
    {
        ;
    }
}
