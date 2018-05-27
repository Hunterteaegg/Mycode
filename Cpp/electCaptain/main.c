#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <ctype.h>

#define NAME_LEN 100
#define SEX_LEN 10

typedef struct
{
    int id;
    char firstName[NAME_LEN];
    char lastName[NAME_LEN];
    float ability;
    char sex[SEX_LEN];//'true'means male,'false'means female
} Member;

int cmp(const void *a,const void *b) //necessary function for qsort()
{
    Member *aa=(Member *)a;
    Member *bb=(Member *)b;

    if(aa->ability>bb->ability)
    {
        return -1;
    }
    else if(aa->ability<bb->ability)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void input(Member *member)
{
    scanf("%d",&(member->id));
    getchar();
    scanf("%s",(member->firstName));
    getchar();
    scanf("%s",(member->lastName));
    getchar();
    scanf("%s",(member->sex));
    getchar();
    scanf("%f",&(member->ability));
    getchar();
}

void showCaptain(Member member[],int n)
{
    Member mem[n];
    for(int i=0;i<n;i++)
    {
        mem[i]=member[i];
    }
    qsort(mem,n,sizeof(mem[0]),cmp);//Quick-Sort
    printf("%d %s %s %s %f",mem[0].id,mem[0].firstName,mem[0].lastName,mem[0].sex,mem[0].ability);
}
int main()
{
    int num;
    scanf("%d",&num);
    Member members[num];//

    for(int i=0;i<num;i++)
    {
        input(members+i);
    }
    showCaptain(members,num);

    return 0;
}
