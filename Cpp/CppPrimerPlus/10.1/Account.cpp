#include <iostream>
#include <cstring>
#include "bank.h"

int Account::id_generate=0;

void Account::showDetail() const
{
    std::cout<<"# "<<Account::id<<" "<<Account::name<<" "<<Account::deposit<<std::endl;
}

void Account::pullDeposit(double num)
{
    Account::deposit-=num;
}

void Account::pushDeposit(double num)
{
    Account::deposit+=num;
}
