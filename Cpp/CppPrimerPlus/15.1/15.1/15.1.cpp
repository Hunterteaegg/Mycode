// 15.1.cpp: 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "tv.h"

int main()
{
	Tv tv;
	Remote remote;
	
	tv.onoff();
	tv.settings();
	remote.chanup(tv);
	tv.settings();

    return 0;
}

