#include<stdio.h>
main() {
	long f1=1,f2=1;
	int i=2;
	printf("1�·ݺ�2�·ݵ�������Ϊ:%ld\n",f1);
	while(i<12) {
		++i;
		f1=f1+f2;
		printf("��%d�µ�������Ϊ:%ld\n",i,f1);
		++i;
		f2=f1+f2;
		printf("��%d�µ�������Ϊ:%ld\n",i,f2);
	}
}