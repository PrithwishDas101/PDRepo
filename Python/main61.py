# Python reading files (.txt, .json, .csv)

import json
import csv

file_path = "Python\\output.txt"

try:
    with open(file_path, "r") as file:
        content = file.read()
        print(content)
except FileNotFoundError:
    print("The file was not found")
except PermissionError:
    print("You do not have permission to read that file")


file_path1 = "Python\\output.json"

try:
    with open(file_path1, "r") as file:
        content = json.load(file)
        print(content)
except FileNotFoundError:
    print("The file was not found")
except PermissionError:
    print("You do not have permission to read that file")


file_path2 = "Python\\output.csv"

try:
    with open(file_path2, "r") as file:
        content = csv.reader(file)
        for line in content:
            print(line) 
except FileNotFoundError:
    print("The file was not found")
except PermissionError:
    print("You do not have permission to read that file")