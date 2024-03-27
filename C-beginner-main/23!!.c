#include <stdio.h>

int main(){
    int a,b,c,d,e ;
    scanf("%1d%1d%1d%1d%1d", &a, &b, &c, &d ,&e);

    int X[5] = {a,b,c,d,e};

    int m = 10000;
    for (int i=0 ; i<5 ; i++){
        printf("[%d]\n", X[i]*m);
        m /= 10;
    }
    return 0;
}