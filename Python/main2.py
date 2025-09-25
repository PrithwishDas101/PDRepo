# variable = A container for a value (string, integer, float, boolean)
#            A variable behaves as if it was the value it contains


#String
first_name = "bro"
last_name = "code"
fav_food = "pizza"
email = "bro123@gmail.com"

print(f"hello {first_name} {last_name}")
print(f"You like {fav_food}")
print(f"your email is {email}")

#Integer

age = 25
quantity = 3
numOfStudents = 110

print(f"You are {age} years old")
print(f"you bought a total of {quantity} {fav_food}s")
print(f"your class has {numOfStudents} students")

#Float

price = 10.99
gpa = 7.3
distance = 5.5

print(f"the price of a {fav_food} is {price}")
print(f"your gpa is {gpa}")
print(f"you ran over {distance} miles")

#Boolean

is_student = True
is_homophobic = True
is_online = False

if is_student:
    print("you are a student")
else:
    print("you are NOT a student")

if is_homophobic:
        print("pd is homophobic")
else:
        print("pd is gay")

if is_online:
    print("you are online")
else:
    print("you are not online")