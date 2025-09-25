# variable scope   = where a variable is visible and accessible
# scope resolution = (LEGB) local -> Enclosed -> Global -> Built-in

def func1():
    a = 1      # Local variable
    print(a)

    def func2():
#       a =2       # Local variable
        print(a)
    func2()

func1()

from math import e

def func3():
    print(e)

e = 3

func3()