#include <stdio.h>
int F(int n) {
	if(n<=1)
		return n;
	else {
		return F(n-1)+F(n-2);	
	}
}
main() {
	int i, n;
	printf("ÇëÊäÈë¸öÊý:");
	scanf("%d",&n);
	for(i=1;i<n;i++)
	{
		if(i%6==0)
			printf("\n");
		printf("%d\t",F(i));
	}
}

