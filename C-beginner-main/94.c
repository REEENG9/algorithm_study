#include <stdio.h>

int main(){
    int check[19][19];
    
    //배열 0으로 초기화
    for(int i=0 ; i<19 ; i++){
        for(int j=0 ; j<19 ; j++){
            check[i][j] = 0;
        }
    }

    int n; //바둑판에 올릴 흰 돌의 갯수
    scanf("%d", &n);

    int x,y; //바둑판 좌표 입력
    for(int i=0 ; i<n ; i++){
        scanf("%d %d", &x, &y);
        check[x-1][y-1] = 1;
    }

    //바둑판 출력
    for(int i=0 ; i<19 ; i++){
        for(int j=0 ; j<19 ; j++){
            printf("%d ", check[i][j]);
        }
        printf("\n");
    }
}