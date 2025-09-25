# default arguments = A default value for certain paramters
#                     default is used when that argument is omitted
#                     make your functions more flexible, reduces # of arguments
#                     1. positional , 2. DEFAULT, 3. KEYWORD, 4. arbitrary

def net_price(list_price, discount=0, tax=0.25):
    return list_price * (1 - discount) * (1 + tax)

# print(net_price(25.37))
# print(net_price(25.37, 0.1))
print(net_price(25.37, 0.1, 0))

import time

def count(end, start=0):
    for x in range(start, end+1):
        print(x)
        time.sleep(1)
    print("HAPPY NEW YEAR!")
          
print(count(30, 15))