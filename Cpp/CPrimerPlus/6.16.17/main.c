#include <stdio.h>
#include <stdlib.h>

int main()
{
    int deposite=10e6;
    int year;

    while(deposite>=0)
    {
        deposite=deposite*1.08-10;
        year++;
    }
    printf("After %d year later,the money has gone.",year);
    return 0;
}
