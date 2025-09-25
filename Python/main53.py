# Static method = A method that belong to a class rather than an object from the class(instance)
#                 Usually used for general ulitity functions
# 
# Instance methods = Best for operations on instances of the class (objects)
# Static   methods = Best for utility functions that do not need access to class data

class Employee:

    def __init__(self, name, position):
        self.name = name 
        self.position = position

    def get_info(self):
        return f"{self.name} = {self.position}"

    @staticmethod
    def is_valid_position(position):
        valid_position = ["Manager", "Cashier", "Cook", "Janitor"]
        return position in valid_position
    
Employee1 = Employee("Eugun", "Manager")
Employee2 = Employee("Squiward", "Cashier")
Employee3 = Employee("Spongebob", "Cook")

print(Employee.is_valid_position("Cook"))
print(Employee.is_valid_position("Rocket Scientist"))

print(Employee1.get_info())
print(Employee2.get_info())
print(Employee3.get_info())