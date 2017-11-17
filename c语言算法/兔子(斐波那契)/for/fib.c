#include<stdio.h>
#define N 13
main() {
	int i;
	int F[N];
	F[0]=F[1]=1;
	printf("1和2月份兔子数为:%d\n",F[0]);
	for(i=2;i<N;i++) {
		F[i]=F[i-1]+F[i-2];
		printf("第%d月有兔子数:%d\n",i,F[i]);
	}
}