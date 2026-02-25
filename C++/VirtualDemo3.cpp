////////////////////////////////////////////////////////////
//
//  File Name  : VirtualDemo3.cpp
//  Description: This program demonstrates upcasting in C++.
//               A base class pointer is used to access a 
//               derived class object. Shows which functions 
//               are accessible via the base class pointer 
//               and which are not.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

class Base
{
    public:
        int i;                                   // Data member i
        int j;                                   // Data member j

        void fun()                               // Base function fun
        {
            cout << "Inside Base fun\n";
        }

        void gun()                               // Base function gun
        {
            cout << "Inside Base gun\n";
        }

        void sun()                               // Base function sun
        {
            cout << "Inside Base sun\n";
        }

        void bun()                               // Base function bun
        {
            cout << "Inside Base bun\n";
        }
};

class Derived : public Base
{
    public:
        int x;                                   // Data member x

        void gun()                               // Overridden function gun
        {
            cout << "Inside Derived gun\n";
        }

        void sun()                               // Overridden function sun
        {
            cout << "Inside Derived sun\n";
        }

        void run()                               // Derived-only function run
        {
            cout << "Inside Derived run\n";
        }

        void mun()                               // Derived-only function mun
        {
            cout << "Inside Derived mun\n";
        }
};

int main()
{
    Base *bp = new Derived();                   // Upcasting: Base pointer points to Derived object

    bp->fun();                                  // Calls Base fun
    bp->gun();                                  // Calls Base gun (Base pointer cannot access overridden unless virtual)
    bp->sun();                                  // Calls Base sun
    // bp->run();                               // ERROR: Base pointer cannot access Derived-only functions
    // bp->mun();                               // ERROR: Base pointer cannot access Derived-only functions
    bp->bun();                                  // Calls Base bun

    return 0;
}