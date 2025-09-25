# 2D collections

groceries = [["apple", "orange", "banana", "coconut"],
             ["celery", "carrots", "potatoes"],
             ["chicken", "fish", "turkey"]]

print(groceries)
print(groceries[0][1])
print(groceries[2][2])

for collection in groceries:
        print(collection)


for collection in groceries:
    for food in collection:
        print(food, end = " ")
    print()


num_pad = ((1, 2, 3),
           (4, 5, 6),
           (7, 8, 9),
           ("*", 0, "#"))

for row in num_pad:
    for num in row:
        print(num, end=" ")
    print()