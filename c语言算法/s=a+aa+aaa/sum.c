#include<stdio.h>
main() {
	int sn=0,tn=0,a,n,count=1;
	printf("������a��n��ֵ:");
	scanf("%d%d",&a,&n);
	while(count<=n) {
		tn=tn+a;
		sn=sn+tn;
		a=a*10;
		++count;
	}
	printf("a+aa+aaa+...=%d\n",sn);
}