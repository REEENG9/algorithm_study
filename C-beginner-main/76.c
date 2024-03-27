#include <stdio.h>

int main(){
    int n;
    int sum=0;
    scanf("%d", &n);

    for(int i=0 ; i<=n ; i++){
       if(i%2==0) sum += i;
    }

    printf("%d", sum);
}

// #include <stdio.h>

// int main(){
//     int n;
//     int sum=0;
//     scanf("%d", &n);

//     for(int i=0 ; i<=n ; i+=2){
//        sum += i;
//     }

//     printf("%d", sum);
// }