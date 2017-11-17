#include <stdio.h>
main()
{ 
int i,s,n=1;
for(i=1;i<10;i++)
{
s=(n+1)*2;
n=s;
}
printf("第一天共摘了%d个桃\n",s);
}