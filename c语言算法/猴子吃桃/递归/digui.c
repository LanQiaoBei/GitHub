#include <stdio.h>
int f(int x) {
	if(x==10) return 1;
    return (f(x+1)+1)*2;
}

int main() {
    int i;
    for(i=1; i<=10; i++)
    printf("%d\n", f(i));
}
