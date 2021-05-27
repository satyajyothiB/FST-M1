user_list= list(input("enter nums seperated by commas to create a list ").split(","))
print("user provided list is ",user_list)
if(user_list[0]==user_list[-1]):
    print(True)
else:
    print(False)