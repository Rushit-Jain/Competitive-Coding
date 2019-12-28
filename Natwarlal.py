lis=[111,1111,112,12,13,1,445,1000,2112,1221,90,80,5,7,8,9,190,200,212,567,777,899,123,22,45,77,8,9,10,233,221,34,222,190,80,70,35,32,12,0]
t=sum(lis)
n=0
o=0
while(lis!=[] and nch==True):
	m=max(lis[0],lis[-1])
	n=n+m
	if(m==lis[0]):
		lis.pop(0)
	else:
		lis.pop(-1)
	nch=False
	if(nch==False):
		m=max(lis[0],lis[-1])
		o=o+m
		if(m==lis[0]):
			lis.pop(0)
		else:
			lis.pop(-1)
		nch=True
if(nch==True):
    print(t)
else:
    print('0')
#21, 211, 15099, 10605 = 25936
#This code is for the third test case. Change the lis variable as per the requirement
