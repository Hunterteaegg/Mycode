#ifndef PLORG_H_INCLUDED
#define PLORG_H_INCLUDED

class Plorg
{
private:
    char name[20];
    int CI;

public:
    Plorg(const char *m_name="Plorga",int m_CI=50);
    void setCI(int m_CI);
    void showDetail() const;
};

#endif // PLORG_H_INCLUDED
