///////////////////////////////////////////////////////
//
//  File name :     StructureDemo2.c
//  Description :   This program demonstrates the use of structures 
//                  It initializes a structure and displays the values 
//                  of its members using the direct accessing (.) operator.
//  Author :        Pallavi Sable
//  Date :          07/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

struct Demo
{
    int i;
    float f;
    int j;
};

int main()
{
    struct Demo obj;

    obj.i = 11;
    obj.f = 90.4f;
    obj.j = 21;

    printf("%d\n",obj.i);   // 11
    printf("%f\n",obj.f);   // 90.4
    printf("%d\n",obj.j);   // 21
    
    return 0;
}