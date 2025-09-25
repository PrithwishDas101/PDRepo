# Python quiz game

questions = ("Who is the president of the United States?",
             "How many elements are in the periodic table?",
             "What is the most abudnant gas in the Earth's atmosphere?",
             "Which is the hottest celebrity in 2025?"
             "Which is the longest bone in the human body?")

options = (("A. Putin", "B. Stalin", "C. Trump", "D. Netanyahu"),
           ("A. 56", "B. 99", "C. 108", "D. 118"),
           ("A. N", "B. O", "C. C", "D. H"),
           ("A. Scarlett Johanson", "B. Sydney Sweeny", "C. Ana de Armas", "D. Billie Eilish"),
           ("A. femur", "B. humerous", "C. patella", "D. vladin"))

answers = ("C", "D", "A", "B", "A")
guesses = []
score = 0
question_num = 0

for question in questions:
    print("--------------------")
    print(question)
    for option in options[question_num]:
        print(option)

    guess = input("Enter (A, B, C, D): ").upper()
    guesses.append(guess)

    if guess == answers[question_num]:
        score += 1
        print("CORRECT")
    else:
        print("INCORRECT")
        print(f"{answers[question_num]} is the correct answer")

    question_num += 1

print("----------------")
print("     RESULT     ")
print(("---------------"))

print("answers: ", end="")
for answer in answers:
    print(answer, end=" ")
print()

print("guesses: ", end="")
for guess in guesses:
    print(guess, end=" ")
print()

score = int(score / len(questions) * 100)
print(f"Your score is: {score}%")