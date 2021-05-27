import pandas
dt=pandas.read_excel("User.xlsx","Sheet1")
print(dt)
print("No of rows in dict is: ",dt.shape[0])
print("No of columns in dict is: ",dt.shape[1])
print(dt["Email"])
print(dt.sort_values("FirstName"))