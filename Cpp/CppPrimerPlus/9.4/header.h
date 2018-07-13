#ifndef HEADER_H_INCLUDED
#define HEADER_H_INCLUDED

namespace SALES
{
    const int QUARTERS=4;
    struct Sales
    {
        double sales[QUARTERS];
        double average;
        double _max;
        double _min;
    };
    void setSales(Sales &s,const double ar[],int n);
    void setSales(Sales &s);
    void showSales(const Sales &s);
}

#endif // HEADER_H_INCLUDED
