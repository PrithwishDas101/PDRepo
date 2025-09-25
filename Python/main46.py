# object = A "bundle" of related attributes (variables) and methods (functions)
#          Ex. phone, cup, book
#          You need a "class" to create an object

# class  = (blueprint) used to design the structure and layout of an object

from main46car import Car

Car1 = Car("Mustang", 2024, "red", False)
Car2 = Car("Corvette", 2023, "black", True)
Car3 = Car("Charger", 2024, "white", True)

print(Car1.model)
print(Car1.year)
print(Car1.color)
print(Car1.for_sale)

print()

print(Car2.model)
print(Car2.year)
print(Car2.color)
print(Car2.for_sale)

print()

print(Car3.model)
print(Car3.year)
print(Car3.color)
print(Car3.for_sale)

print()

Car1.drive()
Car1.stop()
Car1.describe()

print()

Car2.drive()
Car2.stop()
Car2.describe()

print()

Car3.drive()
Car3.stop()
Car3.describe()