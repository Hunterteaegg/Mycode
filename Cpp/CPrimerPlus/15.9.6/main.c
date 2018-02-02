#include <stdio.h>
#include <stdlib.h>

struct model{
unsigned int id : 8;
unsigned int size : 7;
unsigned int B : 2;
unsigned int I : 1;
unsigned int U : 0;
}word;

int main()
{
    model.id=1;
    model.size=12;
    model.B=0;
    model.I=0;
    model.U=0;

    int id,size;
    char *status_on="on";
    char *status_off="off";
    char *left="left";
    char *middle="middle";
    char *right="right";
    char choice;

    printf("ID SIZE ALIGNMENT B  I  U\n");
    printf("%d   %d   %s     %s  %s %s\n",model.id,model.size,model.)

    return 0;
}
