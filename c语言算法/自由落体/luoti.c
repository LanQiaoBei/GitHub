#include <stdio.h>
main() {
	int i,sum=100,h=sum/2;
	for(i=2;i<=10;i++) {
		sum=sum+2*h;
		h=h/2;
	}
	printf("%d\t%d\n",sum,h);
}