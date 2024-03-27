#include <stdio.h>

int main(){

    int h,w;
    scanf("%d %d", &h, &w); //격자판 세로와 가로

    //격자판 정의역 1<=w,h<=100
    int check[100][100];

    //배열 0으로 초기화
    for(int i=0 ; i<100 ; i++){
        for(int j=0 ; j<100 ; j++){
            check[i][j] = 0;
        }
    }

    int n; //막대의 개수
    scanf("%d", &n);

    int l,d,x,y; //막대의 길이, 방향, 좌표
    for(int i=0 ; i<n ; i++){ //막대 개수 만큼 반복
        scanf("%d %d %d %d", &l,&d,&x,&y);

        if(d==0){ //가로 방향이면
            for(int j=0 ; j<l ; j++){ //길이 만큼 반복(격자 채우기)
                check[x-1][y-1] = 1;
                y++; //y좌표 (가로) 증가
            }
        }
        if(d==1){ //세로 방향이면
            for(int j=0 ; j<l ; j++){
                check[x-1][y-1] = 1;
                x++; //x좌표 (세로) 증가
            }
        }
    }

    // 입력한 격자판 크기 만큼 출력
    for(int i=0 ; i<h ; i++){
        for(int j=0 ; j<w ; j++){
            printf("%d ", check[i][j]);
        }
        printf("\n");
    }
}