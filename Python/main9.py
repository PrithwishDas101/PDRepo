# python weight converter 

import math

weight = float(input("Enter your weight: "))
unit = input("Kilogram or Pounds? (Kg or Lb): ")

if unit == "Kg":
    weight *= 2.205
    unit = "pounds"
    print(f"Your weight is: {round(weight, 2)} {unit}")
elif unit == "Lb":
    weight /= 2.205
    unit = "kilograms"
    print(f"Your weight is: {round(weight, 2)} {unit}")
else:
    print(f"Your {unit} is not valid fam")

