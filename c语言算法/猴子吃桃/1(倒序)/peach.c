#include <stdio.h>
main() {
	int i, sum=1;
	for(i=9;i>=1;i--) {
		sum=2*(sum+1);
	}
	printf("%d\n",sum);
}