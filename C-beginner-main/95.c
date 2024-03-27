#include <stdio.h>

int main(){
    int check[19][19];

    //바둑판 입력 받기
    for(int i=0 ; i<19 ; i++){
        for(int j=0 ; j<19 ; j++){
            scanf("%d", &check[i][j]);
        }
    }

    int n; //뒤집을 좌표 갯수
    scanf("%d", &n);

    int x,y; //좌표 갯수 만큼 좌표 입력
    for(int i=0 ; i<n ; i++){
        scanf("%d %d", &x, &y);
        x--;
        y--;

        //이중 반복문 (x좌표 뒤집기, y좌표 뒤집기)
        for(int i=0 ; i<19 ; i++){
            if(check[x][i]==0) check[x][i] = 1;
            else check[x][i] = 0;
            
            for(int j=0 ; j<19 ; j++){
                if(check[j][y]==0) check[j][y] = 1;
                else check[j][y] = 0;
            }
        }
    }

    //뒤집기 실행 후 바둑판 출력
    for(int i=0 ; i<19 ; i++){
        for(int j=0 ; j<19 ; j++){
            printf("%d ", check[i][j]);
        }
    printf("\n");
    }
}