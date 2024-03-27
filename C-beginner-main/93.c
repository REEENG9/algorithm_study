#include <stdio.h>

void sort(int* arr, int size);

int main(){
    
    int n;
    scanf("%d", &n);

    int Num[10000];

    for(int i=0 ; i<n ; i++){
        int k;
        scanf("%d ", &k);
        Num[i] = k;
    }

    sort(Num, n);

    printf("%d", Num[0]);
}




void sort(int* arr, int size) { //버블 정렬
    int temp = 0;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}


  