#ifndef CLASSIC_H_INCLUDED
#define CLASSIC_H_INCLUDED

#include "cd.h"
#include <cstring>

class Classic:public Cd
{
private:
    std::string work;

public:
    Classic(std::string m_work,char *s1,char *s2,int n,double x);
    Classic(const Classic &c);
    Classic();
    virtual ~Classic();
    virtual void Report() const;
    Classic operator=(const Classic &c);
};


#endif // CLASSIC_H_INCLUDED
