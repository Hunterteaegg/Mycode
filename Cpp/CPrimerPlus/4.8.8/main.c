#include <stdio.h>
#include <stdlib.h>

int main()
{
    float liter,kilometer,gallon,mile,hundred_km;

    printf("Enter your kilometers and liters:\n");
    scanf("%f %f",&kilometer,&liter);
    gallon=3.785*liter;
    mile=1.609*kilometer;
    hundred_km=kilometer/100;
    printf("%.1f liter/100km \n",liter/hundred_km);
    printf("%.1f mile/gallon \n",mile/gallon);

    return 0;
}
