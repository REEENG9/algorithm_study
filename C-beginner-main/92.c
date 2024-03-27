#include <stdio.h>

int main(){
    
    int n;
    scanf("%d", &n);

    int Attend_Num[10000];
    
    int m;
    for(int i=1 ; i<=n ; i++){
        scanf("%d", &m);
        Attend_Num[i] = m;
    }

    for(int i=n ; i>=1 ; i--){
        printf("%d ", Attend_Num[i]);
    }
}
