# module = a file containing code you want to include in your program
#          use 'import' to include a module (built-in or your own)
#          useful to break up a large program reusable seprates files

# print(help("modules"))
# print(help("math"))

# import math
# print(math.pi)

# import math as m
# print(m.pi)

# from math import pi  (NOT RECOMMENDED AS IT CLASHES WITH ELEMENTS)
# print(pi)

import main39Example

result = main39Example.pi
result1 = main39Example.square(3)
result2 = main39Example.cube(3)
result3 = main39Example.circumference(3)
result4 = main39Example.area(3)

print(result)
print(result1)
print(result2)
print(result3)
print(result4)