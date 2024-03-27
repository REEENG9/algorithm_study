#include <stdio.h>

int main(){
    char q;

    while(1){
        scanf("%c ", &q);
        if(q=='q'){
            printf("%c", q);
            break;
        }
        else{
            printf("%c\n", q);
            continue;
        }
    }
}

// 문자 받을 때 공백도 문자 하나로 취급됨 ㅗ