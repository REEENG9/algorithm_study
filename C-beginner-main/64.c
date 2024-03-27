#include <stdio.h>

int main (){
    int a,b,c;
    scanf("%d %d %d", &a, &b, &c);
    if(a%2==0) printf("even\n");
    else printf("odd\n");
    if(b%2==0) printf("even\n");
    else printf("odd\n");
    if(c%2==0) printf("even\n");
    else printf("odd\n");
}

// 코드블록의 내용이 논리적으로 1개 단위라면 코드블록 기호를 생략할 수 있다.