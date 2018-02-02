#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num[1000];
    int count_1=0,count_2=0,count_3=0,count_4=0,count_5=0,count_6=0,count_7=0,count_8=0,count_9=0,count_10=0;

    srand(1);
    for(int i=0;i<=99;i++)
    {
        num[i]=(rand())%10+1;
    }
    srand(2);
    for(int i=100;i<=199;i++)
    {
        num[i]=(rand())%10+1;
    }
    srand(3);
    for(int i=200;i<=299;i++)
    {
        num[i]=(rand())%10+1;
    }
    srand(4);
    for(int i=300;i<=399;i++)
    {
        num[i]=(rand())%10+1;
    }
    srand(5);
    for(int i=400;i<=499;i++)
    {
        num[i]=(rand())%10+1;
    }
    srand(6);
    for(int i=500;i<=599;i++)
    {
        num[i]=(rand())%10+1;
    }
    srand(7);
    for(int i=600;i<=699;i++)
    {
        num[i]=(rand())%10+1;
    }
    srand(8);
    for(int i=700;i<=799;i++)
    {
        num[i]=(rand())%10+1;
    }
    srand(9);
    for(int i=800;i<=899;i++)
    {
        num[i]=(rand())%10+1;
    }
    srand(10);
    for(int i=900;i<=999;i++)
    {
        num[i]=(rand())%10+1;
    }
    for(int i=0;i<1000;i++)
    {
        switch(num[i])
        {
            case 10:count_10++;
                    break;
            case 1:count_1++;
                   break;
            case 2:count_2++;
                   break;
            case 3:count_3++;
                   break;
            case 4:count_4++;
                   break;
            case 5:count_5++;
                   break;
            case 6:count_6++;
                   break;
            case 7:count_7++;
                   break;
            case 8:count_8++;
                   break;
            case 9:count_9++;
                   break;
        }
    }
    printf("%d %d %d %d %d %d %d %d %d %d",count_1,count_2,count_3,count_4,count_5,count_6,count_7,count_8,count_9,count_10);

    return 0;
}
