#include<stdio.h>
#define N 13
main() {
	int i;
	int F[N];
	F[0]=F[1]=1;
	printf("1��2�·�������Ϊ:%d\n",F[0]);
	for(i=2;i<N;i++) {
		F[i]=F[i-1]+F[i-2];
		printf("��%d����������:%d\n",i,F[i]);
	}
}