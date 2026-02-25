////////////////////////////////////////////////////////////
//
//  File Name  : VirtualDemo2.cpp
//  Description: This program demonstrates single inheritance 
//               in C++ and shows object casting: no casting, 
//               upcasting, and the error in downcasting 
//               without proper type conversion.
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

        void fun()                               // Member function fun
        {
            cout << "Inside Base fun\n";
        }

        void gun()                               // Member function gun
        {
            cout << "Inside Base gun\n";
        }

        void sun()                               // Member function sun
        {
            cout << "Inside Base sun\n";
        }

        void bun()                               // Member function bun
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

        void run()                               // New member function run
        {
            cout << "Inside Derived run\n";
        }

        void mun()                               // New member function mun
        {
            cout << "Inside Derived mun\n";
        }
};

int main()
{
    Base *bp1 = new Base();                     // No casting, Base object
    Derived *dp1 = new Derived();               // No casting, Derived object
    Base *bp2 = new Derived();                  // Upcasting, Derived object accessed via Base pointer
    // Derived *dp2 = new Base();               // Downcasting ERROR: Cannot convert Base* to Derived* directly

    return 0;
}