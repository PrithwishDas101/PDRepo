# function = A block of reusable code
#            place () after the function name to invoke it

def happy_birthday(name, age):
    print(f"Happy Birthday to you {name}!")
    print(f"You are {age} years old")
    print("Happy Birthday to you! ")
    print()

happy_birthday("Bro Code", 20)
happy_birthday("Bro Luv", 30)


def bill_user(username, amount, due_date):
    print(f"Hello {username} your amount is ${amount:2f} is due on {due_date}")

bill_user("bro code", 366.378, "27th of august, 2025")
bill_user("bro luv", 1827.938149, "16th of july, 2026")
bill_user("luv hector", 213789.1968, "87th moon of zeptem, 2924")
print()



# return: statement used to end a function
#         and send a result back to caller

def add(x, y):
    z = x + y
    return x

def subtract(x, y):
    z = x - y
    return x

def multiply(x, y):
    z = x * y
    return x

def divide(x, y):
    z = x / y
    return x

print(add(2, 5)) 
print(subtract(23, 4))
print(multiply(21, 24))
print(divide(12, 244))


def create_num(first, last):
    first = first.capitalize()
    last  = last.capitalize()
    return first + " " + last

print(create_num("bro", "code"))
print(create_num("bro", "luv"))
print(create_num("luv", "hector"))