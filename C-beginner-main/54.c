#include <stdio.h>

int main (){
    int a,b;
    scanf("%d %d", &a, &b);
    printf("%d", (a&&!b)||(!a&&b));

    return 0;
}

// 불리언 표현을 printf문 안에서도 사용할 수 있음
// %d -> 참일 경우 1을 출력, 거짓일 경우 0을 출력