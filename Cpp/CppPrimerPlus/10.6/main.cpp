#include <iostream>
#include "move.h"

using namespace std;

int main()
{
    Move mymove(2,3);
    mymove.showmove();
    Move yourmove(4,6);
    yourmove.showmove();

    mymove.add(yourmove).showmove();

    return 0;
}
