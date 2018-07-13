#include <iostream>
#include "stdafx.h"
#include "tv.h"

bool Tv::volup()
{
	if (volume < MaxVal)
	{
		volume++;

		return true;
	}
	else
	{
		return false;
	}
}

bool Tv::voldown()
{
	if (volume > MinVal)
	{
		volume--;

		return true;
	}
	else
	{
		return false;
	}
}

void Tv::chanup()
{
	if (channel < maxchannel)
	{
		channel++;
	}
	else
	{
		channel = 1;
	}
}

void Tv::chandown()
{
	if (channel > 1)
	{
		channel--;
	}
	else
	{
		channel = maxchannel;
	}
}

void Tv::settings() const
{
	using std::cout;
	using std::endl;
	cout << "TV is " << (state == Off ? "Off" : "On");
	if (state == On)
	{
		cout << "Volume setting = " << volume << endl;
		cout << "Channel setting = " << channel << endl;
		cout << "Mode = " << (mode == Antenna ? "antenna" : "cable") << endl;
		cout << "Input = " << (input == TV ? "TV" : "DVD") << endl;
	}
}

inline void Tv::remote_set(Remote &r) const
{
	r.state = (r.state == r.NORMAL ? r.INTERACTIVE : r.NORMAL);
}