#include <stdio.h>
#include <stdlib.h>

int main()
{
    float pint,cup,oz,spoon,tea_spoon;

    printf("Enter cups:");
    scanf("%f",&cup);

    pint=2*cup;
    oz=cup/8;
    spoon=oz/2;
    tea_spoon=spoon/3;

    printf("%f pint\n%f oz\n%f spoon\n%f tea_spoon\n",pint,oz,spoon,tea_spoon);

    return 0;
}
