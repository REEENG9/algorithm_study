#include <stdio.h>

int main (){
    int n;
    scanf("%d", &n);

    if(n<=100 && n>=90) printf("A");
    else if (n<=89 && n>=70) printf("B");
    else if (n<=69 && n>=40) printf("C");
    else if (n<=39 && n>=0) printf("D");
}
