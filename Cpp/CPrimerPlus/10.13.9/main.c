#include <stdio.h>
#include <stdlib.h>

#define ROW 3
#define COL 5

void copy_arr(int row,int col,double source[row][col],double target[row][col]);
void show(int row,int col,double source[row][col]);

int main()
{
    double num[3][5]=
    {
        {
            1.1,1.2,1.3,1.4,1.5
        },
        {
            2.1,2.2,2.3,2.4,2.5
        },
        {
            3.1,3.2,3.3,3.4,3.5
        }
    };
    double target[3][5];

    copy_arr(ROW,COL,num,target);
    show(ROW,COL,target);

    return 0;
}

void copy_arr(int row,int col,double source[row][col],double target[row][col])
{
    int i,n;

    for(i=0;i<row;i++)
    {
        for(n=0;n<col;n++)
        {
            target[i][n]=source[i][n];
        }
    }
}

void show(int row,int col,double source[row][col])
{
    int i,n;

    for(i=0;i<row;i++)
    {
        for(n=0;n<col;n++)
        {
            printf("%lf ",source[i][n]);
        }
        printf("\n");
    }
}
