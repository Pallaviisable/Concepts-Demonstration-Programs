///////////////////////////////////////////////////////
//
//  File name :     Structure1.c
//  Description :   This program attempts to demonstrate self-
//                  referential structures. However, directly
//                  including a structure of the same type as
//                  a member (by value) is not allowed and will
//                  result in infinite recursive size.
//  Author :        Pallavi Sable
//  Date :          07/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

struct Demo
{
    int i;
    float f;
    struct Demo dobj;   // NA
};

int main()
{
    return 0;
}