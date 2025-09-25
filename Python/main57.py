# Decorator = A function that extends the behaviour of another function 
#             w/o ,odifying the base function 
#             Pass the base function as an arguement to the decorator

def add_sprinkles(func):
    def wrapper(*args, **kwargs):
        print("*you add sprinkles🎊*")
        func(*args, **kwargs)
    return wrapper

def add_fudge(func):
    def wrapper(*args, **kwargs):
        print("*you add a fudge🍫*")
        func(*args, **kwargs)
    return wrapper

@add_fudge
@add_sprinkles
def get_ice_cream(flavour):
    print(f"Here is your {flavour} ice cream🍧")

get_ice_cream("chocolate")