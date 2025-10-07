///////////////////////////////////////////////////////
//
//  File name :     StructureDemo3.c
//  Description :   This program demonstrates to use a pointer 
//                  to access members of a structure in C. 
//                  The indirect accessing (->) operator is 
//                  used to access structure 
//                  members through a pointer.
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
    struct Demo *p = &obj;

    p->i = 11;
    p->f = 90.4f;
    p->j = 21;

    printf("%d\n",p->i);
    printf("%f\n",p->f);
    printf("%d\n",p->j);
    
    return 0;
}