// 2.3.cpp: 定义控制台应用程序的入口点。
//

#include "stdafx.h"


void print_TBM();
void print_SHTR();

int main()
{
	print_TBM();
	print_TBM();
	print_SHTR();
	print_SHTR();

    return 0;
}

void print_TBM()
{
	std::cout << "Three blind mice" << std::endl;
}

void print_SHTR()
{
	std::cout << "See how they run" << std::endl;
}