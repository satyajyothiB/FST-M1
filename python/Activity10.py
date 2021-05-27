user_tuple= tuple(input("enter nums seperated by commas to create a tuple ").split(","))
print(user_tuple)
for i in user_tuple:
    if int(i)%5==0:
        print(i)
