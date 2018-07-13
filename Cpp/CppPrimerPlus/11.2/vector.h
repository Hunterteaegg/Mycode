#ifndef VECTOR_H_INCLUDED
#define VECTOR_H_INCLUDED

#include <iostream>

namespace VECTOR
{
    class Vector
    {
    private:
        bool mode=false;
        double x;
        double y;

    public:
        Vector();
        Vector(double n1,double n2,bool m_mode=true);
        void reset(double n1,double n2,bool m_mode=true);
        double xval() const
        {
            return x;
        }
        double yval() const
        {
            return y;
        }
        double magval() const;
        double angval() const;
        void polar_mode();
        void rect_mode();

        ~Vector();

        Vector operator+(const Vector &b) const;
        Vector operator-(const Vector &b) const;
        Vector operator-() const;
        Vector operator*(double n) const;

        friend Vector operator*(double n,const Vector &a);
        friend std::ostream & operator<<(std::ostream &os,const Vector &v);
    };
}

#endif // VECTOR_H_INCLUDED
