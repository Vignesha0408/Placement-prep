#include<stdio.h>
#include<stdlib.h>
#include<math.h>
void main()
{
	
	int sum=0,ld,num=1234;
	int n=num;
	int rev=0,i=1;
	while(num>0)
	{
		ld=num%10;
		rev=rev*10+ld;
		num=num/10;
		i++;
		
	}
	if (n==num)
	printf("Given no is palindrome.");
else
	printf("Given no is not palindrome.");
}