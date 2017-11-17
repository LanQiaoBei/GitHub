#include<stdio.h>
#include<math.h>
main() {
	int i,n;
	for(n=101;n<=200;n++) {
		for(i=2;i<sqrt(n+1);i++) {
		if(n%i==0) 
			break;
		}
		if(i>sqrt(n))	
			printf("%d\t",n);
	}
}	
	
