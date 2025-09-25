# indexing = accessing elements of a sequence using [] (indexing operator)
#            [start : end : step]

credit_number = "1234-5678-9012-3456-7890"
last_digits = credit_number[-4:]

print(credit_number[4])
print(credit_number[0:4]) # or you can do print(credit_number[:4])
print(credit_number[5:9])
print(credit_number[5:])
print(credit_number[-1]) # with - the indexing begings from the end
print(credit_number[-5])
print(credit_number[::2]) #prints every second characters
print(credit_number[::4]) #print every fifth characters
print(last_digits)