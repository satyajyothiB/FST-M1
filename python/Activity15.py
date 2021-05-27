try:
    print(x)
except NameError:
    print("variable x doen't exists")
except:
    print("Some other exception occured")

