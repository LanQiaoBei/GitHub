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
	a=n1;b=n2; //����a,b���ڱ���n1,n2ԭ����ֵ,��������С������
	temp=a%b;
	while(temp!=0) {
		a=b;
		b=temp;
		temp=a%b;
	}
	printf("���Լ��Ϊ:%d\n",b);
	printf("��С������Ϊ:%d\n",n1*n2/b);
}