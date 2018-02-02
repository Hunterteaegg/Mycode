#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define RAD_TO_DEG (180/(4*atan(1)))

struct polar{
float length;
float angle;
};

struct rect{
float x;
float y;
};

void culcumlate(struct polar *ap,struct rect *bp);

int main()
{
    float length,angle;
    struct polar POLAR;
    struct rect RECT;

    printf("Enter length and angle:");
    scanf("%f %f",&length,&angle);
    POLAR.length=length;
    POLAR.angle=angle*RAD_TO_DEG;
    culcumlate(&POLAR,&RECT);
    printf("x=%f,y=%f",RECT.x,RECT.y);
    printf("\nBye!");

    return 0;
}

void culcumlate(struct polar *ap,struct rect *bp)
{
    bp->x=(ap->length)*cos(ap->angle);
    bp->y=(ap->length)*sin(ap->angle);
}
