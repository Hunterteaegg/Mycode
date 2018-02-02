#include <stdio.h>
#include <stdlib.h>

#define d_w_rate_1 5
#define d_w_rate_2 20

int main()
{
    float cynara_pound=0,vulgaris_pound=0,carrort_pound=0,total_pound=0;
    float total_fee,deliver_wrap_fee,final_fee;
    float cynara_fee,vulgaris_fee,carrort_fee;
    float pound;
    char input;
    float cynara=2.05,vulgaris=1.15,carrort=1.09;
    int discount;

    printf("a.cynara b.vulgaris c.carrort \n");
    printf("Enter q to quit \n");
    printf("Enter your item:");
    do
    {
        input=getchar();
        switch(input)
        {
            case 'a':printf("Enter your cynara pounds:");
                     scanf("%f",&pound);
                     cynara_pound=cynara_pound+pound;
                     printf("\n");
                     break;
            case 'b':printf("Enter your vulgaris pounds:");
                     scanf("%f",&pound);
                     vulgaris_pound=vulgaris_pound+pound;
                     printf("\n");
                     break;
            case 'c':printf("Enter your carrort pounds:");
                     scanf("%f",&pound);
                     carrort_pound=carrort_pound+pound;
                     printf("\n");
                     break;
            default:continue;
        }
        printf("a.cynara b.vulgaris c.carrort \n");
        printf("Enter q to quit \n");
        printf("Enter your item:");
    }while(input!='q');
    total_pound=cynara_pound+vulgaris_pound+carrort_pound;
    cynara_fee=cynara_pound*cynara;
    vulgaris_fee=vulgaris_pound*vulgaris;
    carrort_fee=carrort_pound*carrort;
    total_fee=cynara_fee+vulgaris_fee+carrort_fee;
    if(total_fee<100)
    {
        discount=0;
    }
    else
    {
        discount=5;
        total_fee=total_fee*0.95;
    }
    if(total_pound<=d_w_rate_1)
    {
        deliver_wrap_fee=6.5;
    }
    else if(total_pound>d_w_rate_1&&total_pound<=d_w_rate_2)
    {
        deliver_wrap_fee=14;
    }
    else
    {
        deliver_wrap_fee=(total_pound-d_w_rate_2)*0.5+14;
    }
    final_fee=total_fee+deliver_wrap_fee;
    printf("\n");
    printf("cynara per  cynara mass  cynara fee \n");
    printf("%10.2f  %11.2f  %10.2f \n",cynara,cynara_pound,cynara_fee);
    printf("vulgaris per  vulgaris mass  vulgaris fee \n");
    printf("%12.2f  %13.2f  %12.2f \n",vulgaris,vulgaris_pound,vulgaris_fee);
    printf("carrort per  carrort mass  carrort fee \n");
    printf("%11.2f  %12.2f  %11.2f \n",carrort,carrort_pound,carrort_fee);
    printf("total fee  deliver and wrap fee \n");
    printf("%9.2f  %19.2f \n",total_fee,deliver_wrap_fee);
    printf("discount  final fee \n");
    printf("%7d%%  %9.2f \n",discount,final_fee);

    return 0;
}
