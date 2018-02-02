#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define CSIZE 4

struct name{
char first[15];
char last[15];
};

struct student{
struct name NAME;
float grade[3];
float ave_grade;
};

struct student info[CSIZE];

void get_info(struct student *target,int i);
void deal_info(struct student *target,int i);
void show_info(struct student *target,int i);
char *s_gets(char *st,int n);

int main()
{
    float total;

    for(int i=0;i<CSIZE;i++)
    {
        get_info(&info[i],i);
    }
    for(int i=0;i<CSIZE;i++)
    {
        deal_info(&info[i],i);
    }
    for(int i=0;i<CSIZE;i++)
    {
        show_info(&info[i],i);
    }
    for(int i=0;i<CSIZE;i++)
    {
        total+=info[i].ave_grade;
    }
    printf("Class ave:%f",total/3);

    return 0;
}

void get_info(struct student *target,int i)
{
    printf("Enter the first name:");
    s_gets(target[i].NAME.first,15);
    printf("Enter the last name:");
    s_gets(target[i].NAME.last,15);
    printf("Enter 3 grades:");
    scanf("%f %f %f",&target[i].grade[0],&target[i].grade[1],&target[i].grade[2]);
    getchar();
}

void deal_info(struct student *target,int i)
{
    target[i].ave_grade=(target[i].grade[0]+target[i].grade[1]+target[i].grade[2])/3;
}

void show_info(struct student *target,int i)
{
    printf("%s %s\n",target[i].NAME.first,target[i].NAME.last);
    printf("%f %f %f ave:%f\n",target[i].grade[0],target[i].grade[1],target[i].grade[2],target[i].ave_grade);
}

char *s_gets(char *st,int n)
{
    char *ret_val;
    char *find;

    ret_val=fgets(st,n,stdin);
    if(ret_val)
    {
        find=strchr(st,'\n');
        *find='\0';
    }
    else
    {
        while(getchar()!='\n')
        {
            continue;
        }
    }

    return ret_val;
}
