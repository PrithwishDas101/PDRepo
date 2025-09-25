# Python writing files(.txt, .json, .csv)

import json
import csv

txt_data = "I like Pizza"
employees = ["Eugene", "Squiward", "Spongebob", "Patrick"]

file_path = "Python//output.txt"
file_path1 = "C:\\Users\\DELL\\Desktop\\output.txt"

with open(file_path, "w") as file: # "a" => append; "r" => read; "w" => write
    file.write("\n" + txt_data + "\n")
    for employee in employees:
        file.write(employee + "\n")
    print(f"txt file: '{file_path}' was created")

try:
    with open(file_path1, "w") as file:
        file.write("\n" + txt_data + "\n")
        for employee in employees:
            file.write(employee + "\n") 
        print(f"txt file: '{file_path1} was created")
except FileExistsError:
    print("That file already exists")



employee1 = {"name": "Spongebob", 
             "age" : 30,
             "job" : "cook"}

file_path2 = "Python//output.json"

try:
    with open(file_path2, "w") as file: 
        json.dump(employee1, file, indent=4)
        print(f"json file: '{file_path2}' was created")
except FileExistsError:
    print("That file already existed")



employee2 = [["Name", "Age", "Job"], 
             ["Spongebob", 30, "Cook"], 
             ["Patrick", 37, "Unemployed"], 
             ["Sandy", 27, "Scientist"]]

file_path3 = "Python//output.csv"

try:
    with open(file_path3, "w", newline="") as file: 
        writer = csv.writer(file)
        for row in employee2:
            writer.writerow(row)
        print(f"csv file: '{file_path3}' was created")
except FileExistsError:
    print("That file already existed")