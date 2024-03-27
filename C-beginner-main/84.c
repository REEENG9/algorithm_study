#include <stdio.h>
#include <math.h>

int main(){
    int w,h,b;
    scanf("%d %d %d", &w,&h,&b);
    double conv = 8*pow(2,20);
    double t = w*h*b;

    float s = t/conv;

    printf("%.2f MB", s);
}