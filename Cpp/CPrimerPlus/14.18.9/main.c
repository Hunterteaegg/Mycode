#include <stdio.h>
#include <stdlib.h>

#define NUM 11
#define F_NUM 4

struct seat{
int num;
int status;
char first_name[15];
char last_name[15];
};

struct flight{
int name;
struct seat chair[NUM];
};

struct flight day_flight[F_NUM]={
{102},{311},{444},{519}
};

void show_list(void);
char choice(void);
void show_num_emp(struct seat *target,int num);
void show_list_emp(struct seat *target,int num);
void show_alphabet(struct seat *target,int num);
void add_list(struct seat *target,int num);
void del_list(struct seat *target,int num);
int top_list_choice(void);

int main()
{
    int flight;

    for(int i=0;i<F_NUM;i++)
    {
        for(int n=0;n<NUM;n++)
        {
            day_flight[i].chair[n].status=0;
        }
    }
    while(1)
    {
        flight=top_list_choice();
        show_list();
        choice();
    }
    return 0;
}

void show_list(void)
{
    printf("To choose a function,enter its letter label:\n");
    printf("a)Show number of empty seats\n");
    printf("b)Show list of empty seats\n");
    printf("c)Show alphabetical list of seats\n");
    printf("d)Assign a customer to a seat assignment\n");
    printf("e)Delete a seat assignment\n");
    printf("f)quit\n");
}

char choice(void)
{
    char dec;

    scanf("%c",&dec);
    getchar();
    switch(dec)
    {
        case 'a':show_num_emp(chair,NUM);
                 break;
        case 'b':show_list_emp(chair,NUM);
                 break;
        case 'c':show_alphabet(chair,NUM);
                 break;
        case 'd':add_list(chair,NUM);
                 break;
        case 'e':del_list(chair,NUM);
                 break;
        default:exit(EXIT_SUCCESS);
    }

    return dec;
}

void show_num_emp(struct seat *target,int num)
{
    int total=0;

    for(int i=0;i<num;i++)
    {
        if(target[i].status==0)
        {
            total++;
        }
    }
    printf("The empty seat number is %d\n",total);
}

void show_list_emp(struct seat *target,int num)
{
    for(int i=0;i<num;i++)
    {
        if(target[i].status==0)
        {
            printf("The empty seat is %d\n",target[i].num);
        }
    }
}

void show_alphabet(struct seat *target,int num)
{
    for(int i=0;i<num;i++)
    {
        printf("%d seat customer: %s %s",target[i].num,target[i].first_name,target[i].last_name);
    }
}

void add_list(struct seat *target,int num)
{
    int number;

    printf("Enter the seat number:");
    scanf("%d",&number);
    getchar();
    target[number].status=1;
    printf("Enter your first name:");
    scanf("%s",target[number].first_name);
    getchar();
    printf("Enter your last name");
    scanf("%s",target[number].last_name);
    getchar();
}

void del_list(struct seat *target,int num)
{
    int number;

    printf("Enter the seat number:");
    scanf("%d",&number);
    getchar();
    target[number].status=0;
}

int top_list_choice(void)
{
    int flight;

    printf("Enter the flight(q to quit):");
    if(scanf("%d",&flight)==0)
    {
        exit(EXIT_SUCCESS);
    }

    return flight;
}
