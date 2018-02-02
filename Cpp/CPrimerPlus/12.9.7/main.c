#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int side,dice,set;

int main()
{
    int num[dice][side];
    int x=0;

    printf("Enter the number of sets;enter q to stop:");
    while(scanf("%d",&set)!=0)
    {
        printf("How many sides and how many dice?");
        scanf("%d %d",&side,&dice);
        printf("Here are %d sets of %d %d-sided throws.\n",set,dice,side);
        for(int i=0;i<dice;i++)
        {
            srand((x++));
            for(int n=0;n<side;n++)
            {
                num[i][n]=(rand())%side+1;
                printf("%d ",num[i][n]);
            }
        }
        printf("\nHow many sets?Enter q to stop:");
    }

    return 0;
}
