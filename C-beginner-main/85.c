#include <stdio.h>

int main(){
    int n;
    int sum=0;
    scanf("%d", &n);

    for(int i=0 ; i<=n ; i++){
        if(sum>=n) break;
        else{
            sum += i;
            continue;
        }
    }
    printf("%d", sum);
}