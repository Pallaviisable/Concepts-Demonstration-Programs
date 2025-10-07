///////////////////////////////////////////////////////
//
//  File name :     StructureSizeXXX.c
//  Description :   This program demonstrates the use of 
//                  '#pragma pack(1)' to control structure 
//                  padding in C. By using this directive, 
//                  the compiler aligns structure members 
//                  with 1-byte boundaries, reducing the 
//                  total size of the structure by avoiding 
//                  padding bytes.
//  Author :        Pallavi Sable
//  Date :          07/10/2025
//
///////////////////////////////////////////////////////
#include<stdio.h>

#pragma pack(1)
struct Demo
{
    int i;
    char ch1;
    float f;
    char ch2;
    int j;
};

int main()
{
    printf("Size of structure is : %lu\n",sizeof(struct Demo));
    
    return 0;
}