// 2.2.cpp: 定义控制台应用程序的入口点。
//

#include "stdafx.h"

using namespace std;

long transform(long input);

int main()
{
	long distance;

	cout << "Enter your distance:";
	cin >> distance;
	cout << "The meters is " << transform(distance) << endl;

    return 0;
}

long transform(long input)
{
	return input * 220;
}

