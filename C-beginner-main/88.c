#include <stdio.h>
#include <math.h>

int main(){
    long long int a,r,n;
    scanf("%lld %lld %lld", &a,&r,&n);
    
    long long int Answer = a*pow(r,n-1);
    printf("%lld", Answer);
}   