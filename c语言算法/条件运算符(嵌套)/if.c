#include <stdio.h>
main() {
	char grade;
	int score;
	printf("������һ������:");
	scanf("%d",&score);
	grade=score>=90?'A':(score>=60?'B':'C');
	printf("%c\n",grade);
}