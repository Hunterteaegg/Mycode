#include <cstring>
#include <cctype>
#include <iostream>
#include "person.h"

Person::Person(const std::string &ln,const char *fn)
{
    Person::lname=ln;
    strcpy(Person::fname,fn);
}

void Person::Show() const
{
    std::cout<<Person::fname<<" "<<Person::lname<<std::endl;
}

void Person::FormalShow() const
{
    std::cout<<Person::lname<<","<<Person::fname<<std::endl;
}
