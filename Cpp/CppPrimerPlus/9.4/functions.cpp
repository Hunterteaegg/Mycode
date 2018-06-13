#include <iostream>
#include "header.h"

void SALES::setSales(SALES::Sales &s,const double ar[],int n)
{
    double _max=ar[0];
    double _min=ar[0];
    double total=0;
    double average=0;

    for(int i=0;i<n;i++)
    {
        if(ar[i]>=_max)
        {
            _max=ar[i];
        }
        if(ar[i]<=_min)
        {
            _min=ar[i];
        }
        total+=ar[i];
        s.sales[i]=ar[i];
    }
    average=total/n;

    s.average=average;
    s._max=_max;
    s._min=_min;
}

void SALES::setSales(SALES::Sales &s)
{
    double ar[4]=
    {
        1,3,5,9,
    };

    SALES::setSales(s,ar,4);
}

void SALES::showSales(const SALES::Sales &s)
{
    for(int i=0;i<SALES::QUARTERS;i++)
    {
        std::cout<<s.sales[i]<<" ";
    }
}
