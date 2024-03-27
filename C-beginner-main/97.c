#include <stdio.h>

int main(){
    int maze [10][10]; //�̷� ���� ũ�� 10*10

    //�̷� ���� ������ ���� ��ġ �Է�
    for(int i=0 ; i<10 ; i++){
        for(int j=0 ; j<10 ; j++){
            scanf("%d", &maze[i][j]);
        }
    }

    //�ʱ� (x,y)��ǥ
    int x = 1;
    int y = 1;

    //���̸� ã����, �������̶� �Ʒ��� �̵��� �� ������

    while(1) {
        
        if(maze[x][y] == 2) { //������ǥ�� ���̰� ������ Ż��~
            maze[x][y] = 9;
            break;
        }
        
        maze[x][y] = 9; //������ġ ��ŷ

        if(maze[x][y+1] == 0 || maze[x][y+1] == 2) { //���������� �̵�����
            y++;
        }
        else { //���� ���� ���
            if(maze[x+1][y] == 0 || maze[x+1][y] == 2) { //�Ʒ��� �̵�����
                x++;
            }
            else {  //�������̶� �Ʒ��� �̵� �Ұ�
                break;
            }
        }
    }

    //������ ���� ���
    for(int i=0 ; i<10 ; i++){
        for(int j=0 ; j<10 ; j++){
            printf("%d ", maze[i][j]);
        }
        printf("\n");
    }
}