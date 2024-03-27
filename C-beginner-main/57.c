#include <stdio.h>

int main (){
    int n;
    scanf("%d", &n);
    printf("%d", ~n);
}


// ** 비트단위(bitwise) 연산자는,
// ~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
// <<(bitwise left shift), >>(bitwise right shift)
// 가 있다.

// 양의 정수는 2진수 형태로 바뀌어 저장되고,
// 음의 정수는 "2의 보수 표현"방법으로 저장된다.