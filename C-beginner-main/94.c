#include <stdio.h>

int main(){
    int check[19][19];
    
    //�迭 0���� �ʱ�ȭ
    for(int i=0 ; i<19 ; i++){
        for(int j=0 ; j<19 ; j++){
            check[i][j] = 0;
        }
    }

    int n; //�ٵ��ǿ� �ø� �� ���� ����
    scanf("%d", &n);

    int x,y; //�ٵ��� ��ǥ �Է�
    for(int i=0 ; i<n ; i++){
        scanf("%d %d", &x, &y);
        check[x-1][y-1] = 1;
    }

    //�ٵ��� ���
    for(int i=0 ; i<19 ; i++){
        for(int j=0 ; j<19 ; j++){
            printf("%d ", check[i][j]);
        }
        printf("\n");
    }
}