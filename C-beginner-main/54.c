#include <stdio.h>

int main (){
    int a,b;
    scanf("%d %d", &a, &b);
    printf("%d", (a&&!b)||(!a&&b));

    return 0;
}

// �Ҹ��� ǥ���� printf�� �ȿ����� ����� �� ����
// %d -> ���� ��� 1�� ���, ������ ��� 0�� ���