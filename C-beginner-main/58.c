#include <stdio.h>

int main (){
    int a,b;
    scanf("%d %d", &a, &b);
    printf("%d", a&b);
}

// ��Ʈ���� ������ & : �� �� 1�� �κ��� �ڸ��� 1�� ������� (�Ǵ� �� �ݴ�)
// ���� ��� 3�� 5�� �ԷµǾ��� ���� ���캸��
// 3     : 00000000 00000000 00000000 00000011
// 5     : 00000000 00000000 00000000 00000101
// 3 & 5 : 00000000 00000000 00000000 00000001
// �� �ȴ�.