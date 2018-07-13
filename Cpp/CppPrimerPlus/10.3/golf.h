#ifndef GOLF_H_INCLUDED
#define GOLF_H_INCLUDED

const int Len=40;

class golf
{
private:
    char fullname[Len];
    int handicap;

public:
    golf(const char *name,int hc);

    int setgolf(golf &g);
    void f_handicap(golf &g,int hc);
    void showgolf(const golf &g);

};

#endif // GOLF_H_INCLUDED
