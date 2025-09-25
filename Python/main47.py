# class variable = Shared among all instances of a class
#                  Defined outside of constructors
#                  Allow you to share data among all the objects created from the class

class student:

    class_year = 2025
    num_student = 0

    def __init__(self, name, age):
        self.name = name
        self.age = age
        student.num_student += 1

student1 = student("Spongebob", 30)
student2 = student("Patrick", 35)

print(student1.name)
print(student1.age)
print(student.class_year)
print(student2.name)
print(student2.age)
print(student2.class_year)

print(f"The class of {student.class_year} has {student.num_student} students ")
