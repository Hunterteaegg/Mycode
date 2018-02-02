#include <stdio.h>
#include <stdlib.h>

int main()
{
    int total,current,sqrt;

    total=0;
    current=1;
    sqrt=0;

    while(current<21)
    {
        sqrt=current*current;
        total=total+sqrt;
        current++;
    }
    printf("%d",total);

    return 0;
}
