#include <stdio.h>
#include <stdlib.h>

void input(double (* target)[5],int row,int col)
{
    int i,n;

    printf("Enter 15 numbers:\n");
    for(i=0;i<row;i++)
    {
        for(n=0;n<col;n++)
        {
            scanf("%lf",&target[i][n]);
        }
    }
}

void per_average(double (* target)[5],int row,int col)
{
    int i,n;
    double subtotal;
    for(i=0;i<row;i++)
    {
        for(n=0,subtotal=0;n<col;n++)
        {
            subtotal+=target[i][n];
        }
        printf("The average of the %d group is %lf\n",i,subtotal/(double)col);
    }
}

void average(double (* target)[5],int row,int col)
{
    int i,n;
    double total;

    for(i=0;i<row;i++)
    {
        for(n=0;n<col;n++)
        {
            total+=target[i][n];
        }
    }
    printf("The average is %lf\n",total/(row*col));
}

void max(double (* target)[5],int row,int col)
{
    int i,n;
    double max;

    max=target[0][0];
    for(i=0;i<row;i++)
    {
        for(n=0;n<col;n++)
        {
            if(target[i][n]>max)
            {
                max=target[i][n];
            }
        }
    }
    printf("The max is %lf\n",max);
}


int main()
{
    double num[3][5];

    input(num,3,5);
    per_average(num,3,5);
    average(num,3,5);
    max(num,3,5);

    return 0;
}
