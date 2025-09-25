# Membership operator = used to test whether a value or variable is found in  a sequence
#                       (string, list, ste, or dictionary)
#                       1. in
#                       2. not in

word = "APPLE"

letter = input("Guess a letter in the secret word: ")

if letter in word:
    print(f"Yes {letter} is in the word")
else:
    print(f"No the {letter} is not in the word")


students = {"spongebob", "larry", "Mr. Munchkinman", "bob"}

student = input("Enter the name of the student you think might be in the school: ")

if student not in students:
    print(f"{student} is not in the school")
else:
    print(f"{student} is in the school")


grades = {"Sandy"    : "A", 
          "Patrick"  : "B", 
          "Spongebob": "C"}

student1 = input("Enter the name of the student: ")

if student1 in grades:
    print(f"{student1}'s grade is {grades[student1]}")
else:
    print(f"{student1} was not found")


email = "BroCode@gmail.com"

if "@" in email and "." in email:
    print("Valid email")
else:
    print("Invalid email")