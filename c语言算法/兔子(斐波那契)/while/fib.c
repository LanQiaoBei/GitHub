#include<stdio.h>
main() {
	long f1=1,f2=1;
	int i=2;
	printf("1月份和2月份的兔子数为:%ld\n",f1);
	while(i<12) {
		++i;
		f1=f1+f2;
		printf("第%d月的兔子数为:%ld\n",i,f1);
		++i;
		f2=f1+f2;
		printf("第%d月的兔子数为:%ld\n",i,f2);
	}
}