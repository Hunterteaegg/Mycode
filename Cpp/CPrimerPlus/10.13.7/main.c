#include <stdio.h>
#include <stdlib.h>

void copy_arr(double (* target)[3],double (* source)[3])

{
    int row,col;

    for(row=0;row<3;row++)
    {
        for(col=0;col<3;col++)
        {
            target[row][col]=source[row][col];
        }
    }
}

void show(double (* display)[3])
{
    int i,n;

    for(i=0;i<3;i++)
    {
        for(n=0;n<3;n++)
        {
            printf("%lf ",display[i][n]);
        }
        printf("\n");
    }
    printf("\n");
}

int main()
{
    double num[3][3]=
    {
        {
            1.1,1.2,1.3
        },
        {
            2.1,2.2,2.3
        },
        {
            3.1,3.2,3.3
        }
    };
    double target[3][3];

    copy_arr(target,num);
    show(target);

    return 0;
}
