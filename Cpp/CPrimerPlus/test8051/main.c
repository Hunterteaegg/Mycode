#include <mcs51reg.h>
// #include <mcs51/8051.h>

void timer() __interrupt 1; // SDCC���жϺ���ҪԤ��������������KEIL C51

unsigned char counter; // ���������
void main()
{
    TMOD = 0x00;    // ��ʱ��0_16λ����
    TH0 = 0xb1;     // �����㶨ʱ20ms��ֵ��0xB1E0,�ָ�8λ�͵�8λд
    TL0 = 0xe0;
    TR0 = 1;        // ��ʱ����ʼ����
    ET0 = 1;        // ����ʱ��0�жϿ���
    EA = 1;         // �������ж�
    while(1)
    {
        ;           // ����ѭ�������ϴ�����ʱ���ж�
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
