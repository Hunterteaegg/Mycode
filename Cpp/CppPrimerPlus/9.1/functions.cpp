#include <iostream>
#include "golf.h"
#include <cstring>

void setgolf(golf & g,const char* name,int hc)
{
    strcpy(g.fullname,name);
    g.handicap=hc;
}

int setgolf(golf & g)
{
    char m_fullname[Len];
    int m_handicap;

    std::cout<<"Enter fullname:";
    std::cin.get(m_fullname,Len);
    getchar();

    std::cout<<"Enter the handicap:";
    std::cin>>m_handicap;
    getchar();

    if(std::cin.good())
    {
        setgolf(g,m_fullname,m_handicap);

        return 1;
    }
    else
    {
        return 0;
    }
}

void handicap(golf &g,int hc)
{
    g.handicap=hc;
}

void showgolf(const golf& g)
{
    std::cout<<g.fullname<<" "<<g.handicap<<std::endl;
}
