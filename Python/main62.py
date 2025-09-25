# date and time

import datetime

date = datetime.date(2025, 1, 13)
today = datetime.date.today()

time = datetime.time(12, 30, 0)
now = datetime.datetime.now()

now = now.strftime("%H:%M:%S %d-%m-%Y")

print(date)
print(today)

print(time)
print(now)


target_datetime = datetime.datetime(2030, 1, 2, 12, 30, 1)
target_datetime1 = datetime.datetime(2021, 2, 3, 12, 3, 4)
current_datetime = datetime.datetime.now()

if target_datetime < current_datetime:
    print("Target date has passed")
else:
    print("Target date has NOT passed")

if target_datetime1 < current_datetime:
    print("Target date has passed")
else:
    print("Target date has NOT passed")
