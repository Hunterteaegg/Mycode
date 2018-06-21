#include <iostream>
#include <cstring>
#include "golf.h"

golf::golf(const char *name,int hc)
{
    strcpy(golf::fullname,name);
    golf::handicap=hc;
}

int golf::setgolf(golf &g)
{
    std::cout<<"Enter full name:";
    std::cin.getline(g.fullname,Len);
    getchar();

    std::cout<<"Enter handicap:";
    std::cin>>g.handicap;
    getchar();

    if(std::cin.good())
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void golf::f_handicap(golf &g,int hc)
{
    g.handicap=hc;
}

void golf::showgolf(const golf &g)
{
    std::cout<<g.fullname<<" "<<g.handicap<<std::endl;
}
