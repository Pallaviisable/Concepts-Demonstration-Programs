////////////////////////////////////////////////////////////
//
//  File Name  : AccessSpecifierDemo.cpp
//  Description: This program demonstrates access specifiers 
//               (public, private, protected) in C++ and how 
//               they affect member access in base and derived 
//               classes.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

class Base
{
    public:
        int i;
    private:
        int j;
    protected:
        int k;

    public:
        Base()
        {
            i = 10; 
            j = 20; 
            k = 30;
        }

        void fun()
        {
            cout << i << "\n";  // Allowed
            cout << j << "\n";  // Allowed
            cout << k << "\n";  // Allowed
        }
};

class Derived : public Base
{
    public:
        int x;

        void Display()
        {
            cout << i << "\n";  // Allowed
            // cout << j << "\n";  // Not Allowed (private in Base)
            cout << k << "\n";  // Allowed (protected in Base)
        }
};

int main()
{
    Base bobj;
    Derived dobj;

    cout << bobj.i << "\n"; // Allowed
    // cout << bobj.j << "\n"; // Not Allowed
    // cout << bobj.k << "\n"; // Not Allowed

    cout << dobj.i << "\n"; // Allowed
    // cout << dobj.j << "\n"; // Not Allowed
    // cout << dobj.k << "\n"; // Not Allowed
    
    dobj.fun();         // Allowed
    dobj.Display();     // Allowed

    return 0;
}