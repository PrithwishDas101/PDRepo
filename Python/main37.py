# List comprehension = A concise way to  create lists in Python
#                      Compact and easier to read than traditional loops
#                      [expression for value in iterable if condition]

doubles = [x * 2 for x in range(1, 11)]
triples = [x * 3 for x in range(1, 11)]
square  = [x * x for x in range(1, 11)]
cube    = [x * x * x  for x in range(1, 11)]
print(doubles)
print(triples)
print(square)
print(cube)


fruits = ["apple", "banana", "cherry", "coconut"]
fruits = [fruit.upper() for fruit in fruits]
fruits1 = [fruit[0] for fruit in fruits]
print(fruits)
print(fruits1)


numbers = [1, 2, 3, 4, 5, -1, -2, -3, -4, -5]
positive_num = [num for num in numbers if num >= 0]
negative_num = [num for num in numbers if num <= 0]
even_num     = [num for num in numbers if num % 2 == 0]
odd_num     = [num for num in numbers if num % 2 != 0]
print(positive_num)
print(negative_num)
print(even_num)
print(odd_num)


grades = [85, 67, 4, 98, 3, 6, 56, 2, 90]
passing_grades = [grade for grade in grades if grade >= 60]

print(passing_grades)