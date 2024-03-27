#include <stdio.h>

int main(){
    long long int n;
    scanf("%lld", &n);
    printf("%lld", n+1);
}

// 증감연산자 : ++a, --a / a++, a-- 등
// 증감연산자를 변수 앞에 붙이면 그 변수를 사용하기 전에 증감을 먼저 수행하고,
// 증감연산자를 변수 뒤에 붙이면 일단 변수에 저장되어있는 값을 먼저 사용하고 난 후 나중에 증감을 수행