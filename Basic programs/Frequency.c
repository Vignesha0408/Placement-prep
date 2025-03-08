#include<stdio.h>
#include<stdlib.h>
void main()
{
	int num,ld,c,n=8277,check=2;
	num = n;
	while(n>0)
	{
		ld= n%10;
		if(ld == check)
			c++;
		n=n/10;
	}
	printf("%d is the occurance.",c);
}