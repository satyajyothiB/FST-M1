def fibonnaci(number):
    if number <= 1:
        return number
    else:
        return (fibonnaci(number-1)+fibonnaci(number-2))

nums=int(input("Enter an integer greater than 0 "))   
print("number of series to print is ",nums)    
for i in range(1,nums+1):
    print(fibonnaci(i))
