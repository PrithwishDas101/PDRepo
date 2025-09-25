# name  = input("Enter your name: ")
# name1 = input("Enter another name: ")
# phn   = input("Enter your phone number: ")

# length = len(name)
# firstSpace = name.find(" ")
# firstA = name.find("A")
# lastA = name.rfind("A")

# name = name.capitalize() # Makes index first letter upper case
# name = name.upper()
# name1 = name1.lower()
# result = name.isdigit()
# result1 = name.isalpha()
# result2 = phn.count("-")
# phn1 = phn.replace("-", "/")

# print(name)
# print(name1)
# print(length)
# print(firstSpace)
# print(firstA)
# print(lastA)
# print(result)
# print(result1)
# print(result2)
# print(phn1)


username = input("ENTER A USERNAME: ")

if len(username) > 12:
    print("Your username can't be more than 12 characters long")
elif not username.find(" ") == -1:
    print("Your username can't contain empty spaces")
elif not username.isalpha():
    print("Your user' can't contain numbers")
else:
    print(f"Welcome {username}")