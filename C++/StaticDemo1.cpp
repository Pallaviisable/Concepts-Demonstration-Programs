////////////////////////////////////////////////////////////
//
//  File Name  : StaticDemo1.cpp
//  Description: This program demonstrates the use of 
//               static data members and static member 
//               functions in C++. It shows how static 
//               members belong to the class rather than 
//               individual objects.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

class Demo
{
    public:
        int i;                                    // Data member i
        int j;                                    // Data member j
        static int x;                             // Static data member x
 
        Demo()                                    // Default constructor
        {
            this->i = 0;
            this->j = 0;
        }

        Demo(int a, int b)                        // Parameterized constructor
        {
            this->i = a;
            this->j = b;
        }

        void Fun()                                 // Non-static member function
        {
            cout << "Inside Fun\n";
        }

        static void Gun()                           // Static member function
        {
            cout << "Inside Gun\n";
        }
};

int Demo::x = 11;                                   // Definition of static data member

int main()
{
    Demo::Gun();                                    // Calling static function without object
    cout << "Value of x is : " << Demo::x << "\n";  // Accessing static data member

    return 0;
}