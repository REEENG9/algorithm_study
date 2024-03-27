#include <stdio.h>

int main(){
    int a,b,c;
    scanf("%d %d %d", &a, &b, &c);
    printf("%lld\n", a+b+c);
    printf("%.1f", (float)(a+b+c)/3);
}