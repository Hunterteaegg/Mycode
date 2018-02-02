#include <stdio.h>
#include <stdlib.h>
#define BOOK "War and Peace"

int main(void)
{
    float cost=12.99;
    float percent=80.0;

    printf("This copy of \"War and Peace\" sells for $%.2f.\n",cost);
    printf("That is %.0f %% of list.",percent);

    return 0;
}
