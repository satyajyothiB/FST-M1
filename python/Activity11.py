fruit_dict={
    "Apple":90,
    "Guava":50,
    "Grapes":20,
    "Banana":160,
    "Pears":60
}
fruit_to_chk =input("Enter a fruit name to check in dict ").title()

if(fruit_to_chk in fruit_dict):
    print("Yes, given fruit is available in dict")
else:
    print("No, given fruit is not available in dict")