////////////////////////////////////////////////////////////
//
//  File Name  : SingleX.cpp
//  Description: This program demonstrates simple single 
//               inheritance in C++. The derived class 
//               inherits members of the base class and can 
//               access them along with its own members.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

class Base
{
    public:
        int i, j;

        void fun()
        {
            cout << "Inside Base fun\n";
        }
};

class Derived : public Base
{
    public:
        int x;

        void gun()
        {
            cout << "Inside Derived gun\n";
        }
};

int main()
{
    Base bobj;
    Derived dobj;

    bobj.fun();       // Accessing Base class function

    dobj.fun();       // Accessing inherited Base class function
    dobj.gun();       // Accessing Derived class function

    return 0;
}