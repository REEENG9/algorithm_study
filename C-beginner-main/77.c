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

// ���� ���� �� ���鵵 ���� �ϳ��� ��޵� ��