#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    long Daphne_dip=1000000,Deirdre_dip=1000000;
    int year=0;

    do
    {
        Daphne_dip=Daphne_dip+Daphne_dip*0.1;
        Deirdre_dip=Deirdre_dip*1.05;
        year++;
    }while(Daphne_dip>=Deirdre_dip);
    printf("After %d years later,Daphne has %ld,Deirdre has %ld",year,Daphne_dip,Deirdre_dip);

    return 0;
}
