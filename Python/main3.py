# Typecasting = the process of converting a variable from one data type to another
#               str(), int(), float(), bool()

name = "Bro Code"
age = 25
gpa = 7.8
is_student = True

print(type(name))
print(type(age))
print(type(gpa))
print(type(is_student))


name = bool(name)
print(name) #prints false if string is empty otherwise prints true


age = float(age)
print(age)

age = str(age)
print(age)

age += "56"
print(age)


gpa = int(gpa)
print(gpa)

gpa = str(gpa)
print(gpa)

gpa += "111"
print(gpa)