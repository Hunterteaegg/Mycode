#include <mcs51reg.h>
// #include <mcs51/8051.h>

void timer() __interrupt 1; // SDCC的中断函数要预先声明，区别于KEIL C51

unsigned char counter; // 软件计数器
void main()
{
    TMOD = 0x00;    // 定时器0_16位计数
    TH0 = 0xb1;     // 经计算定时20ms初值是0xB1E0,分高8位和低8位写
    TL0 = 0xe0;
    TR0 = 1;        // 定时器开始运行
    ET0 = 1;        // 开定时器0中断开关
    EA = 1;         // 开启总中断
    while(1)
    {
        ;           // 进入循环，不断触发定时器中断
    }
}

void timer() __interrupt 1
{
   counter++;
   if(counter==50)
   {
      counter = 0;
      P1_2 = !P1_2;
   }
}
