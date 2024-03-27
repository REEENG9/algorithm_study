#include <stdio.h>

int main(){
    int s;
    scanf("%x", &s);

    for(int i=1 ; i<16 ; i++){
        printf("%X*%X=%X\n", s,i,s*i);
    }
}