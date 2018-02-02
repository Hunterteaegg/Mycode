#include <stdio.h>
#include <stdlib.h>

int critic(void);

int main()
{
    int units;

    printf("How many pounds to a firkin of butter?\n");
    scanf("%d",&units);
    while(units!=56)
    {
        units=critic();
    }
    printf("You must look it up!\n");

    return 0;
}

int critic(void)
{
    int units;

    printf("No luck,my friend.Try again.\n");
    scanf("%d",&units);

    return units;
}
