# Logical operators = evaluate multiple conditions (or, and, not)

temp = 25
is_raining = True
is_sunny = False

if temp > 35 or temp < 0 or is_raining:
    print("The outdoor event is cancelled")
else:
    print("The outdoor event is still scheduled")


if temp >= 28 and is_sunny:
    print("It is sunny outside")
elif temp <= 0 and is_sunny:
    print("It is too cold outside")
elif not is_sunny:
    print("The sun is not out today")
else:
    print("It is sunny outside")


