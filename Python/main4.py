# input = A function that prompts the user to input a user data 
#         Returns the entered data as a string 

name = input("what's your name?: ")
age = int(input("how old are you my guy?: "))

age += 1

print(f"Hello {name}!")
print(f"Happy Birthday!")
print(f"you are {age} years old!! ")


# exercise 1 - rectangle area calc

length = float(input("Enter the length of the rectangle: "))
width  = float(input("Enter the width of the rectangle: "))

area = length * width

print(f"The area is {area}cm²") # alt + 0178 = ², alt + 0179 = ³


# exercise 2 - shopping cart calc

item = input("What would you like to buy?: ")
price = float(input("Enter the price of your item: "))
quantity = int(input("How many would you like to buy?: "))

total = price * quantity

print(f"You have bought {quantity} x {item}/s ")
print(f"Your total is ${total}")
