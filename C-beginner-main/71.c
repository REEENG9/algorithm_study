#include <stdio.h>

int main(){
    int n;

    while(1) {
        int n=0;
        scanf("%d", &n);

        if(n==0)
            break;
        else
            printf("%d\n", n);
            continue;        
    }
}