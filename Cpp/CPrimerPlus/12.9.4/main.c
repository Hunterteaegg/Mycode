#include <stdio.h>
#include <stdlib.h>

void count(void);

int main()
{
    for(int i=1;i<=3;i++)
    {
        count();
    }

    return 0;
}

void count(void)
{
    static int i;

    i++;
    printf("The count is %d\n",i);
}
