#include <stdio.h>
#include <stdlib.h>

int main()
{
    int week=1,num=5;

    while(num<=150)
    {
        num=(num-week)*2;
        printf("I have %d friends in %d week.\n",num,week);
        week++;
    }

    return 0;
}
