#include <stdio.h>
#include <stdlib.h>

void mult(int row,int col,int source[row][col])
{
    int i,n;

    for(i=0;i<row;i++)
    {
        for(n=0;n<col;n++)
        {
            source[i][n]=2*source[i][n];
        }
    }
}

void show(int row,int col,int source[row][col])
{
    int i,n;

    for(i=0;i<row;i++)
    {
        for(n=0;n<col;n++)
        {
            printf("%d ",source[i][n]);
        }
        printf("\n");
    }
}

int main()
{
    int num[3][5]=
    {
        {
            2,3,4,5,6
        },
        {
            1,2,3,4,5
        },
        {
            6,7,8,9,0
        }
    };

    mult(3,5,num);
    show(3,5,num);

    return 0;
}
