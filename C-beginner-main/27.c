#include <stdio.h>

int main(){
    double d;
    scanf("%lf", &d);
    printf("%.11lf", d);
}

// float :  +- 3.4*10^-38 ~ +- 3.4*10^38 범위의 실수
// (출력형 %f)

// double은 더 정확하게 저장할 수 있지만, float보다 2배의 저장 공간이 필요

// double : +- 1.7*10^-308 ~ +- 1.7*10^308 범위의 실수
// (출력형 %lf (long float))

