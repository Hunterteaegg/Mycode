#include "move.h"
#include <iostream>

Move::Move(double a,double b)
{
    Move::x=a;
    Move::y=b;
}

void Move::showmove() const
{
    std::cout<<"("<<Move::x<<","<<Move::y<<")"<<std::endl;
}

Move Move::add(const Move &m) const
{
    return Move(Move::x+m.x,Move::y+m.y);
}

void Move::reset(double a,double b)
{
    Move::x=a;
    Move::y=b;
}
