#include <stdlib.h>
#include <stdio.h>

int *make_array(int elem,int val)
{
    int *ptr=malloc(elem*sizeof(int));

    for(int i=0;i<elem;i++)
    {
        ptr[i]=val;
    }

    return ptr;
}

void show_array(const int ar[],int n)
{
    for(int i=0;i<n;i++)
    {
        if(i%8==0)
        {
            printf("\n");
        }
        printf("%d ",ar[i]);
    }
    printf("\n");
}
