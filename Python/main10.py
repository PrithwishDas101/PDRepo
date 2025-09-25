# Python Temperature converter

unit = input("Is this Temperature in fahrenheit or celcius? (C/F): ")
temp = float(input("Enter the Temperature: "))

if unit == "C":
    temp = round((9 * temp) / 5 + 32, 1)
    print(f"The tempearture in fahrenheit is: {temp}F")
elif unit == "F":
    temp = round((temp - 32) * 5/9, 1)
    print(f"The tempearture in fahrenheit is: {temp}C")   
else:
    print(f"Enter a valid unit bro cuz {unit} is not a valid unit of measurement")