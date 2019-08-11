#include <stdio.h>
long cube (long n)
{
	long c=0,s=0;
	c=n*n*n;
	if (c>9)
	{
		do
		{	
			s=c%10;
			c=c/10;
		} while(c>9);
	}
	return s;
}
void main()
{
	long i,s1=0,s2=0,s3=0;
	for(i=1;i<=5;i++)
		s1+=cube(i);
	for(i=1;i<=500;i++)
		s2+=cube(i);
	for(i=1;i<=5000000000;i++)
		s3+=cube(i);
	printf("%d",(s1*s2*s3)%1000007);
}
