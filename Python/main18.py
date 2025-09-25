# for loop = execute a block of code a fixed number of times.
#            You can iterate over a range, string, sequence, etc.

credit_card = "1234-5678-9012-3456"

for x in reversed(range(1, 10, 2)):
    print(x)

print("Happy NEW YEAR!")

for x in credit_card:
    print(x)

for x in range(1, 21):
    if x == 13:
        continue
    else:
        print(x)