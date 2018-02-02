#include <stdio.h>
#include <stdlib.h>

#define ROWS 3
#define COLS 5

void input(int row,int col,double target[row][col])
{
    int i,n;

    for(i=0;i<row;i++)
    {
        for(n=0;n<col;n++)
        {
            scanf("%lf",&target[i][n]);
        }
    }
}

void per_average(int row,int col,double target[row][col])
{
    int i,n;
    double subtotal;

    for(i=0;i<row;i++)
    {
        for(n=0,subtotal=0;n<col;n++)
        {
            subtotal+=target[i][n];
        }
        printf("The %d group average is %lf\n",i,subtotal/col);
    }
}

void average(int row,int col,double target[row][col])
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

void max(int row,int col,double target[row][col])
{
    int i,n;
    double max=target[0][0];

    for(i=0;i<row;i++)
    {
        for(n=0;n<col;n++)
        {
            if(max<target[i][n])
            {
                max=target[i][n];
            }
        }
    }
    printf("The max is %lf\n",max);
}

int main()
{
    double num[ROWS][COLS];

    input(ROWS,COLS,num);
    per_average(ROWS,COLS,num);
    average(ROWS,COLS,num);
    max(ROWS,COLS,num);

    return 0;
}
