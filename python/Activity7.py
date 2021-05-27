ls1= list(input("enter nums seperated by commas ").split(","))
ls=[2,4,5,1,7,9]
total=0
for i in ls:
    total=total+i
total1=0
for i in ls1:
    total1=total1+int(i)
print("The sum of values in ls is ",total)
print("The sum of values in lss is ",total1)
