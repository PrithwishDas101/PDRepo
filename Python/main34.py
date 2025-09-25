#  *args    = allows you to pass multiple non-key arguments
#  **kwargs = allows you to pass mutlitple keyword-arguments
#             * unpacking operator
#             1. positional 2. default 3. keyword 4. ARBITRARY

def add(*args):
    total = 0
    for arg in args:
        total += arg
    return total

print(add(2, 3, 4, 5, 6, 7, 8, 9, 10))

def name_show(*args):
    for arg in args:
        print(arg ,end=" ")

name_show("Dr.", "Haresh", "Gyokeres", "III")


def print_address(**kwargs):
    # for value in kwargs.values()
    for key, value in kwargs.items():
        print(f"{key}: {value}")

print_address(street="123-FakeStreet", 
              apt="100",
              city="Detroit", 
              state="MI", 
              zip="54321")



def shipping_label(*args, **kwargs):
    for arg in args:
        print(args, end=" ")
    print()
    
    print(f"{kwargs.get('street')}")
    print(f"{kwargs.get('apt')}")
    print(f"{kwargs.get('city')}")
    print(f"{kwargs.get('state')}")
    print(f"{kwargs.get('zip')}")

shipping_label("Dr.", "Yahwei", "Squarepants", "II",
               street="876-FakuStreet", 
               apt="987",
               city="Michigan", 
               state="NY", 
               zip="098763")    