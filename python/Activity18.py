import pandas as pd
dt=pd.read_csv("user_pass.csv")
print("printing only UserNames:")
print(dt["UserNames"])
print("printing UserNames and password of 2nd user")
print(dt["UserNames"][1],dt["Passwords"][1])
print("printing dataframe by ascending UserNames:")
print(dt.sort_values("UserNames"))
print("printing dataframe by descending UserNames:")
print(dt.sort_values("UserNames",ascending=False))

