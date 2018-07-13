#ifndef CD_H_INCLUDED
#define CD_H_INCLUDED

class Cd
{
private:
    char *performers;
    char *label;
    int selections;
    double playtime;

public:
    Cd(char *s1,char *s2,int n,double x);
    Cd(const Cd &d);
    Cd();
    virtual ~Cd();
    virtual void Report() const;
    Cd operator=(const Cd &d);
};

#endif // CD_H_INCLUDED
