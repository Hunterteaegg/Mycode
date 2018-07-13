#ifndef LIST_H_INCLUDED
#define LIST_H_INCLUDED

class List
{
private:
    int num[10];
    static int point;

public:
    bool isEmpty();
    bool isFull();
    void add(int i);
};

#endif // LIST_H_INCLUDED
