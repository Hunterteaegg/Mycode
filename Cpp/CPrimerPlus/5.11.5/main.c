#include <stdio.h>
#include <stdlib.h>

int main()
{
    int total,current;

    total=0;
    current=1;

    while(current<21)
    {
        total=total+current;
        current++;
    }
    printf("The salary is %d.",total);

    return 0;
}
