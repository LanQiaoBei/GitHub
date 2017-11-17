#include <stdio.h>
main() {
	int n1,n2,temp,a,b;
	printf("please input two number:");
	scanf("%d,%d",&n1,&n2);
	if(n2>n1) {
		temp=n1;
		n1=n2;
		n2=temp;
		}
	a=n1;b=n2; //定义a,b用于保存n1,n2原来的值,用于求最小公倍数
	temp=a%b;
	while(temp!=0) {
		a=b;
		b=temp;
		temp=a%b;
	}
	printf("最大公约数为:%d\n",b);
	printf("最小公倍数为:%d\n",n1*n2/b);
}