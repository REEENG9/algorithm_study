#include <stdio.h>

int main(){
    double d;
    scanf("%lf", &d);
    printf("%.11lf", d);
}

// float :  +- 3.4*10^-38 ~ +- 3.4*10^38 ������ �Ǽ�
// (����� %f)

// double�� �� ��Ȯ�ϰ� ������ �� ������, float���� 2���� ���� ������ �ʿ�

// double : +- 1.7*10^-308 ~ +- 1.7*10^308 ������ �Ǽ�
// (����� %lf (long float))

