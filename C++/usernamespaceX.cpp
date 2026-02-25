////////////////////////////////////////////////////////////
//
//  File Name  : usernamespaceX.cpp
//  Description: This program demonstrates the use of 
//               multiple namespaces in C++. It shows how 
//               'using namespace' allows direct access to 
//               members of a specific namespace without 
//               using the scope resolution operator every time.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

namespace PPA
{
    int i = 11;                               // Variable i in namespace PPA
}

namespace LB
{
    int j = 21;                               // Variable j in namespace LB
}

using namespace LB;                           // Allows direct access to LB members

int main()
{
    cout << PPA::i << "\n";                  // Accessing i from PPA namespace (Output: 11)
    cout << j << "\n";                        // Accessing j directly from LB namespace (Output: 21)

    return 0;
}