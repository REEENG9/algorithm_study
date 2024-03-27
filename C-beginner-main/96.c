#include <stdio.h>

int main(){

    int h,w;
    scanf("%d %d", &h, &w); //������ ���ο� ����

    //������ ���ǿ� 1<=w,h<=100
    int check[100][100];

    //�迭 0���� �ʱ�ȭ
    for(int i=0 ; i<100 ; i++){
        for(int j=0 ; j<100 ; j++){
            check[i][j] = 0;
        }
    }

    int n; //������ ����
    scanf("%d", &n);

    int l,d,x,y; //������ ����, ����, ��ǥ
    for(int i=0 ; i<n ; i++){ //���� ���� ��ŭ �ݺ�
        scanf("%d %d %d %d", &l,&d,&x,&y);

        if(d==0){ //���� �����̸�
            for(int j=0 ; j<l ; j++){ //���� ��ŭ �ݺ�(���� ä���)
                check[x-1][y-1] = 1;
                y++; //y��ǥ (����) ����
            }
        }
        if(d==1){ //���� �����̸�
            for(int j=0 ; j<l ; j++){
                check[x-1][y-1] = 1;
                x++; //x��ǥ (����) ����
            }
        }
    }

    // �Է��� ������ ũ�� ��ŭ ���
    for(int i=0 ; i<h ; i++){
        for(int j=0 ; j<w ; j++){
            printf("%d ", check[i][j]);
        }
        printf("\n");
    }
}