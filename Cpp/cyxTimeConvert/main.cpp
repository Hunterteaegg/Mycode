#include <iostream>

using namespace std;

struct Time //定义一个“时间”结构，它包含小时、分钟、秒。相当于面向对象编程中的“类”
{
    int hours;
    int minutes;
    int seconds;
};

int roundRead(void) //设置循环次数
{
    int repeat=0;

    scanf("%d",&repeat);
    getchar();//因为在输入字符的时候，最后按下回车会产生换行符。比如输入63，按回车会变成63\n，因此要把\n吞掉。getchar字面意思是获得输入流的字符

    return repeat;
}

void timeSet(struct Time * time)
{
    //set hours
    char temp;//吞掉无关字符，可以无视，反正没用
    scanf("%d%c%d%c%d%c",&time->hours,&temp,&time->minutes,&temp,&time->seconds,&temp);
}

void timeAdjust(struct Time * time) //adjust time
{
    /*
        add extra time as seconds 输入额外的秒数
    */
    int sec;
    scanf("%d",&sec);
    getchar();
    time->seconds+=sec;

    /*
        begin to adjust time 开始调整时间
    */
    if(time->seconds>=60)
    {
        time->minutes+=time->seconds/60;//time->minutes=time->minutes+time->seconds/60的缩写版。
        time->seconds%=60;//秒数除以60得到进位的分钟，取余数得到进位后剩下的秒数，下同
    }
    if(time->minutes>=60)
    {
        time->hours+=time->minutes/60;
        time->minutes%=60;
    }
    if(time->hours>=24)
    {
        time->hours-=24;//超过二十四小时减24，重新计数
    }
}

void printTime(struct Time time)
{
    printf("%d%c%d%c%d\n",time.hours,':',time.minutes,':',time.seconds);//格式化输出
}

int main()
{
    //define repeat and time
    int repeat=roundRead();//读取循环次数
    struct Time time[repeat];//定义结构数组

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
