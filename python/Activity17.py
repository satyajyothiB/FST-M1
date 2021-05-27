import pandas as pd
data={
    "UserNames":["admin","Charles","Deku"],
    "Passwords":["password","Charl13","AllMight"]
    }
dt=pd.DataFrame(data)
print(dt)
dt.to_csv("user_pass.csv",index=False)