#include <stdio.h>
#include <stdlib.h>

int main(){
    
    int n,m;
    scanf("%d", &n);

    int *Attend_Num = malloc(sizeof(int)*24);
    // int Attend_Num[24];
    // for(int i=0; i<24 ; i++){
    //     Attend_Num[i] = 0;
    // }

    for(int i=0 ; i<n ; i++){
        scanf("%d", &m);
        Attend_Num[m] ++;
    }
    for(int i=1 ; i<24 ; i++){
        printf("%d ", Attend_Num[i]);
    }

    free(Attend_Num);
}
