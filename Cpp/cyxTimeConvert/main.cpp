#include <iostream>

using namespace std;

struct Time //define Time struct as default
{
    int hours;
    int minutes;
    int seconds;
};

int roundRead(void) //set round number
{
    int repeat=0;

    scanf("%d",&repeat);
    getchar();

    return repeat;
}

void timeSet(struct Time * time)
{
    //set hours
    char temp;
    scanf("%d%c%d%c%d%c",&time->hours,&temp,&time->minutes,&temp,&time->seconds,&temp);
}

void timeAdjust(struct Time * time) //adjust time
{
    /*
        add extra time as seconds
    */
    int sec;
    scanf("%d",&sec);
    getchar();
    time->seconds+=sec;

    /*
        begin to adjust time
    */
    if(time->seconds>=60)
    {
        time->minutes+=time->seconds/60;
        time->seconds%=60;
    }
    if(time->minutes>=60)
    {
        time->hours+=time->minutes/60;
        time->minutes%=60;
    }
    if(time->hours>=24)
    {
        time->hours-=24;
    }
}

void printTime(struct Time time)
{
    printf("%d%c%d%c%d\n",time.hours,':',time.minutes,':',time.seconds);
}

int main()
{
    //define repeat and time
    int repeat=roundRead();
    struct Time time[repeat];

    //input and adjust time
    for(int i=0;i<repeat;i++)
    {
        timeSet(&time[i]);
        timeAdjust(&time[i]);
    }

    //make a new line
    printf("\n");

    //print time one by one
    for(int i=0;i<repeat;i++)
    {
        printTime(time[i]);
    }

    return 0;
}
