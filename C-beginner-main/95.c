#include <stdio.h>

int main(){
    int check[19][19];

    //�ٵ��� �Է� �ޱ�
    for(int i=0 ; i<19 ; i++){
        for(int j=0 ; j<19 ; j++){
            scanf("%d", &check[i][j]);
        }
    }

    int n; //������ ��ǥ ����
    scanf("%d", &n);

    int x,y; //��ǥ ���� ��ŭ ��ǥ �Է�
    for(int i=0 ; i<n ; i++){
        scanf("%d %d", &x, &y);
        x--;
        y--;

        //���� �ݺ��� (x��ǥ ������, y��ǥ ������)
        for(int i=0 ; i<19 ; i++){
            if(check[x][i]==0) check[x][i] = 1;
            else check[x][i] = 0;
            
            for(int j=0 ; j<19 ; j++){
                if(check[j][y]==0) check[j][y] = 1;
                else check[j][y] = 0;
            }
        }
    }

    //������ ���� �� �ٵ��� ���
    for(int i=0 ; i<19 ; i++){
        for(int j=0 ; j<19 ; j++){
            printf("%d ", check[i][j]);
        }
    printf("\n");
    }
}