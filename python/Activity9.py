user_list1= list(input("enter nums seperated by commas to create a list1 ").split(","))
user_list2= list(input("enter nums seperated by commas to create a list2 ").split(","))
print("user provided list1 is ",user_list1)
print("user provided list2 is ",user_list2)
new_list=[]
for i in user_list1:
    if int(i)%2!=0:
       new_list.append(i)
for i in user_list2:
    if int(i)%2==0:
       new_list.append(i)
print(new_list)