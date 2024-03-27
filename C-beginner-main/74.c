#include <stdio.h>

int main(){
    char a = 'a';
    char x;

    scanf("%c", &x);
    
    do{
        printf("%c ", a);
        a++;
    }
    while(a<x+1);
}