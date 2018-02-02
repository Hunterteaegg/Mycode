#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num,count;

    printf("Enter a number:");
    scanf("%d",&num);
    count=num+11;
    while(num<count)
    {
        printf("%d ",num);
        num++;
    }
    return 0;
}
