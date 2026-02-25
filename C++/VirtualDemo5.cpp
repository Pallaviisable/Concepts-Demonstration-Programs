////////////////////////////////////////////////////////////
//
//  File Name  : VirtualDemo5.cpp
//  Description: This program demonstrates upcasting in C++ 
//               with virtual and non-virtual functions. 
//               It shows how Base class pointers access 
//               Base and Derived functions depending on 
//               virtual keyword.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

#pragma pack(1)
class Base
{
    public:
        int i;                                   // Data member i
        int j;                                   // Data member j

        void fun()                               // Non-virtual function fun
        {
            cout << "Inside Base fun\n";
        }

        void gun()                               // Non-virtual function gun
        {
            cout << "Inside Base gun\n";
        }

        virtual void sun()                        // Virtual function sun
        {
            cout << "Inside Base sun\n";
        }

        virtual void bun()                        // Virtual function bun
        {
            cout << "Inside Base bun\n";
        }
};

#pragma pack(1)
class Derived : public Base
{
    public:
        int x;                                   // Data member x

        void gun()                               // Non-virtual function gun (hides Base gun)
        {
            cout << "Inside Derived gun\n";
        }

        void sun()                               // Overridden virtual function sun
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
    Base *bp = new Derived();                  // Upcasting: Base pointer points to Derived object

    bp->fun();                                 // Calls Base fun (non-virtual)
    bp->gun();                                 // Calls Base gun (non-virtual)
    bp->sun();                                 // Calls Derived sun (virtual function)
    // bp->run();                              // ERROR: Base pointer cannot access Derived-only functions
    // bp->mun();                              // ERROR: Base pointer cannot access Derived-only functions
    bp->bun();                                 // Calls Derived bun (virtual function)

    return 0;
}