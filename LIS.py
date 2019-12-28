o1=[1,2,3]
o2=[2,3,4]
o3=[4,5,6]
h=min(o3)+max(o3)+min(o2)+max(o2)+o1[2]
print(h)

#Note - This has been created in accordance with the requirement of the problem statement.
#Explanation - When only one of the dimensions is common in any two objects, we add the minimum and maximum dimension of those objects. When there are two common dimensions, we just add the maximum dimension of the object whose no dimension has yet been added to the resulting height.
