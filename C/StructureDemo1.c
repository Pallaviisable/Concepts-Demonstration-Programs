///////////////////////////////////////////////////////
//
//  File name :     StructureDemo6.c
//  Description :   This program demonstrates how to determine
//                  the size of a structure and its variable
//                  using sizeof(). 
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

    printf("Size of Demo is : %lu\n",sizeof(struct Demo));       // 12
    printf("size of object is : %lu\n",sizeof(obj));
    
    return 0;
}