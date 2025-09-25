# Python file detection

import os
 
file_path = "Python\\test.txt"
file_path1 = "C:\\Users\\DELL\\Desktop\\test.txt"
file_path2 = "C:\\Users\\DELL\\Desktop\\test"

if os.path.exists(file_path):
    print(f"The location '{file_path}' exists")

    if os.path.isfile(file_path):
        print("This is a file")
else:
    print(f"That location does not exist")

if os.path.exists(file_path1):
    print(f"The location '{file_path1}' exists")

    if os.path.isfile(file_path1):
        print("This is a file")
    elif os.path.isdir(file_path1):
        print("This is a directory")
else:
    print(f"That location does not exist")

if os.path.exists(file_path2):
    print(f"The location '{file_path2}' exists")

    if os.path.isfile(file_path2):
        print("This is a file")
    elif os.path.isdir(file_path2):
        print("This is a directory")
else:
    print(f"That location does not exist")