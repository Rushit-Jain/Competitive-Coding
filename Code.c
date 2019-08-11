#include <stdio.h>
#include <math.h>
void main()
{
	int a[12],i=0,p,min=0;
	scanf("%d",&p);
	for(i=0;i<12;i++)
	{
		a[i]=(int)pow(2,i);
	}
	start: for(i=0;i<12;i++)
	{
		if(a[i]>=p)
			break;
	}
	if(i!=12)
		p=p-a[i];
	else
	{
		p-=2048;
		min++;
	}
	if(p==0)
		min++;
	else
		goto start;
	printf("%d",min);
}

		
	
		
