# multiple inheritance   = inherit from more than one parent class
#                          C(A, B)

# multilevel inheritance = inherit from a parent which inherits from another parent
#                          C(B) <- B(A) <- A

class Animal:

    def __init__(self, name):
        self.name = name

    def eat(self):
        print(f"This {self.name} is eating")
    def sleep(self):
        print(f"This {self.name} is sleeping")

class Prey(Animal):
    def flee(self):
        print(f"This {self.name} is fleeing")

class Predator(Animal):
    def hunt(self):
        print(f"This {self.name} is hunting")

class Rabbit(Prey):
    pass

class Hawk(Predator):
    pass

class Fish(Prey, Predator):
    pass

rabbit = Rabbit("rabbi")
hawk = Hawk("hawk tuah")
fish = Fish("goldy")

# rabbit.hunt() => Shows error (Rabbit has no hunt attribute)
rabbit.flee()
rabbit.eat()
rabbit.sleep()

hawk.hunt()
# hawk.flee() => Shows error(Hawk has no flee attribute)
hawk.eat()
hawk.sleep()

fish.hunt()
fish.flee()
fish.eat()
fish.sleep()