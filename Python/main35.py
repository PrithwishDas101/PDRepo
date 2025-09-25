# iterables = An objective/cpollection that can return its elements one at a time.
#             allowing it to be iterated over in a loop

numbers = [1, 2, 3, 4, 5]

for blablabla in reversed(numbers):
    print(blablabla, end=" ")
    
print(" ")

set = {"apple", "orange", "banana", "coconut"}

for blublublu in set:
    print(blublublu, end=" ")

print(" ")

name = "Bro Code"

for blebleble in name:
    print(blebleble, end=" ")

print(" ")

my_dictionary = {"A": 1, "B":2, "C":3}

for key, value in my_dictionary.items():
    print(f"{key} = {value}")