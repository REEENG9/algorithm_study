#include <stdio.h>
#include <math.h>

int main(){
    double h,b,c,s;
    unsigned int trans = pow(2,20);
 
    scanf("%lf %lf %lf %lf", &h, &b, &c, &s);

    double byte = (h*b*c*s)/8;
    float t = byte/trans;

    printf("%.1f MB", t);
}