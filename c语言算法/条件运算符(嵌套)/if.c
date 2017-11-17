#include <stdio.h>
main() {
	char grade;
	int score;
	printf("请输入一个分数:");
	scanf("%d",&score);
	grade=score>=90?'A':(score>=60?'B':'C');
	printf("%c\n",grade);
}