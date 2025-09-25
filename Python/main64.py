# multithreading = Used to perform multiple tasks concurrently (muktitasking)
#                  Good for I/O bound tasks like reading files or fetchign data from API
#                  threading.Thread(target=my_function)

import time
import threading

def walk_dog(first_name, last_name):
    time.sleep(8)
    print(f"You finished walking your dog {first_name} {last_name}")

def take_out_trash():
    time.sleep(4)
    print("You finished taking out the trash")

def get_mail():
    time.sleep(2)
    print("You finished getting the mail")

chore1 = threading.Thread(target=walk_dog, args=("scooby", "Doo"))
chore1.start()

chore2 = threading.Thread(target=take_out_trash)
chore2.start()

chore3 = threading.Thread(target=get_mail)
chore3.start()

chore1.join()
chore2.join()
chore3.join()

print("All chores are complete")