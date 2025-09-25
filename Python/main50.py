# super() = Function used in a child class to call methods from a parent class (superclass)
#           Allows you to extend the functionality of the inherited methods

class shape:
    def __init__(self, color, is_filled):
        self.color = color
        self.is_filled = is_filled

    def describe(self):
        print(f"It is a {self.color} and {'filled' if self.is_filled else 'not filled'}")

class Circle(shape):
    def __init__(self, color, is_filled, radius):
        super().__init__(color, is_filled)
        self.radius = radius

class Triangle(shape):
    def __init__(self, color, is_filled, width):
        super().__init__(color, is_filled)
        self.width = width

class Square(shape):
    def __init__(self, color, is_filled, width, height):
        super().__init__(color, is_filled)
        self.width = width
        self.height = height

circle = Circle(color="red", is_filled="True", radius=5)
print(circle.color)
print(circle.is_filled)
print(circle.radius)
circle.describe()

triangle = Triangle(color="blue", is_filled="False", width=9)
print(triangle.color)
print(triangle.is_filled)
print(triangle.width)
circle.describe()

square = Square(color="orange", is_filled="True", width=5, height=6)
print(square.color)
print(square.is_filled)
print(square.width)
print(square.height)
circle.describe()