//Deposite
//Withdraw
//Balance check
//PIN change : default pin 8277

#include<stdio.h>
#include<stdlib.h>
int balance=0,pin=8277,ch;
void balance1()
{
	
	printf("Your balance is %d",balance);
}
void deposite()
{
	int dep;
	printf("Enter the amount to deposite:");
	scanf("%d",&dep);
	balance=balance+dep;
	
}
void withdraw()
{
	int amt;
	printf("Enter the withdraw amount...");
	scanf("%d",&amt);
	if (amt<balance)
		balance=balance-amt;
	else
		printf("Not enough balance you have..");
}



void Pin_change()
{
	
	printf("Enter new pin:");
	scanf("%d",&pin);
	printf("pin changed..");
}
int main()
{
	int key;
	printf("Enter pin:");scanf("%d",&key);
	if(pin == key)
	{
		ch=5;
	while(ch!=0)
	{
	printf("\n1.Deposite");
	printf("\n2.Withdraw");
	printf("\n3.Balance check.");
	printf("\n4.Pin change");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1:deposite(); break;
		case 2:withdraw(); break;
		case 3:balance1(); break;
		case 4:Pin_change(); break;
		
		
	}
	}
	}
	else
		printf("sorry .. Wrong pin ...\n\n try again bye.");
	
	return 0;
}