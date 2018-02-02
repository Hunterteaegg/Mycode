#include <stdio.h>
#include <stdlib.h>

int main()
{
    char name[8]="Hunter";

    printf("\"%s\"\n",name);
    printf("\"%20s\"\n",name);
    printf("\"%-20s\"\n",name);
    printf("%9s\n",name);

    return 0;
}
