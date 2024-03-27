#include <stdio.h>

int main(){
    int n;
    int f;
    int sum=0;
    scanf("%d", &n);

    for(int i=0 ; i<=n ; i++){
        if(sum>=n) break;
        else{
            sum += i;
            f = i;
            continue;
        }
    }
    printf("%d", f);
}