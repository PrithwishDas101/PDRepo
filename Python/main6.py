import math

#friends = 5

#friends -= 3
#friends += 3
#friends *= 3
#friends **= 3
#friends /= 3
#friends %= 3

#print(friends)


x= 3.14
y = 4
z = 5

#result = round(x)
#result = abs(y)
#result = pow(y, z)
#result = max(x, y)
#result = min(z, y)

#print(result)


x = 9.9

# print(math.pi)
# print(math.e)
# print(math.sqrt(x))
# print(math.ceil(x))
# print(math.floor(x))

radius = float(input("Enter radius: "))

area = math.pi * radius * radius
print(f"the area of the circle is {round(area, 2)}cm²")

sideA = float(input("Enter side A: "))
sideB = float(input("Enter side B: "))

sideC = math.sqrt(pow(sideA, 2) + pow(sideB, 2))

print(f"The value of side C = {round(sideC, 1)}cm")