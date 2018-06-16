#include "list.h"

      int List::point=0;

bool List::isEmpty()
{
    return List::point==0;
}

bool List::isFull()
{
    return List::point==10;
}

void List::add(int i)
{
    List::num[List::point++]=i;
}
