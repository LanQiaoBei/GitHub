#include <stdio.h>
main() {
	int spacenum=0,charnum=0,num=0,others=0;
	char ch;
	printf("please input a String:\n");
	while((ch=getchar())!='\n') {
		if(ch>='A'&&ch<='Z' ||ch>='a'&&ch<='z')
			charnum++;
		else if(ch==' ')
			spacenum++;
		else if(ch>='0'&& ch<='9')
			num++;
		else
			others++;
	}
	printf("char=%d space=%d digit=%d others=%d\n",charnum,spacenum,num,others);
}