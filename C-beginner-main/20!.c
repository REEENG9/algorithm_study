#include <stdio.h>

int main(){
    char s[2001];
    fgets(s, 2000, stdin);
    printf("%s", s);
    
    return 0;
}