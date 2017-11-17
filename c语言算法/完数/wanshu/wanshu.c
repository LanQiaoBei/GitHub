#include <stdio.h>
#include<math.h>
main() {
	int i,j;
	for(i=2;i<=1000;i++) {
		int sum=0;
		for(j=1;j<i;j++) {
			if(i%j==0)
				sum=sum+j;
		}
			if(sum==i)
				printf("%d\t",i);
	}
}