#include <stdio.h>

int main(){
    int maze [10][10]; //미로 상자 크기 10*10

    //미로 상자 구조와 먹이 위치 입력
    for(int i=0 ; i<10 ; i++){
        for(int j=0 ; j<10 ; j++){
            scanf("%d", &maze[i][j]);
        }
    }

    //초기 (x,y)좌표
    int x = 1;
    int y = 1;

    //먹이를 찾으면, 오른쪽이랑 아래로 이동할 수 없으면

    while(1) {
        
        if(maze[x][y] == 2) { //현재좌표에 먹이가 있으면 탈출~
            maze[x][y] = 9;
            break;
        }
        
        maze[x][y] = 9; //현재위치 마킹

        if(maze[x][y+1] == 0 || maze[x][y+1] == 2) { //오른쪽으로 이동가능
            y++;
        }
        else { //벽이 있을 경우
            if(maze[x+1][y] == 0 || maze[x+1][y] == 2) { //아래로 이동가능
                x++;
            }
            else {  //오른쪽이랑 아래로 이동 불가
                break;
            }
        }
    }

    //개미의 동선 출력
    for(int i=0 ; i<10 ; i++){
        for(int j=0 ; j<10 ; j++){
            printf("%d ", maze[i][j]);
        }
        printf("\n");
    }
}