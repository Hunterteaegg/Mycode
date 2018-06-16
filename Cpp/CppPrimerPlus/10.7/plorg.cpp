#include "plorg.h"
#include <iostream>
#include <cstring>

Plorg::Plorg(const char *m_name,int m_CI)
{
    strcpy(Plorg::name,m_name);
    Plorg::CI=m_CI;
}

void Plorg::setCI(int m_CI)
{
    Plorg::CI=m_CI;
}

void Plorg::showDetail() const
{
    std::cout<<Plorg::name<<" "<<Plorg::CI<<std::endl;
}
