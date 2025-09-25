# inheritance = Allows a class to inherit attributes and methods from another class
#               Helps with code reusability and extensibility

#               class Child(Parent)

class Animal:
    def __init__(self, name):
        self.name = name 
        self.is_alive = True

    def eat(self):
        print(f"The {self.name} is eating")

    def sleep(self):
        print(f"The {self.name} is sleeping")

class Dog(Animal):
    def speak(self):
        print(f"{self.name} speaks doggy style")

class Cat(Animal):
    def speak(self):
        print(f"{self.name} speaks cattie style")

class Donkey(Animal):
    def speak(self):
        print(f"{self.name} speaks donkey style")

dog    = Dog   ("Scooby")
cat    = Cat   ("Garfield")
donkey = Donkey("Rupert")

print(dog.name)
print(dog.is_alive)
dog.eat()
dog.sleep()
dog.speak()

print(cat.name)
print(cat.is_alive)
cat.eat()
cat.sleep()
cat.speak()

print(donkey.name)
print(donkey.is_alive)
donkey.eat()
donkey.sleep()
donkey.speak()