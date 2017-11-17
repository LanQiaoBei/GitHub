#include <stdio.h>
#include <math.h>
main() {
	int i,j;
	for(i=2;i<=1000;i++) {
		int sum=1;
		long k=sqrt(i);
		for(j=2;j<=k;j++) {
			if(i%j==0)
				sum=sum+j+i/j;
			}
		if(i==k*k) sum=sum-k;	
		if(sum==i)
		printf("%d\t",i);
	}
}