#include <stdio.h>

int main(){
    int x, y, z ;
    scanf("%d.%d.%d", &x, &y, &z);
    printf("%04d.%02d.%02d", x, y, z);
    
    return 0;
}