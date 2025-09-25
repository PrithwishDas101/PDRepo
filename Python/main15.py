# format specifiers = {:flag} format a value based on what flags are 
#                     are inserted


price1 = 26236737.2871
price2 = -28237.23489
price3 = 932392

# Adding decimal figures

print(f"Price 1 is = ${price1:.1f}") # adds one decimal place
print(f"Price 2 is = ${price2:.2f}") # adds two decimal places
print(f"Price 3 is = ${price3:.3f}") # adds three decimal places

# Adding spaces 

print(f"Price 1 is = ${price1:020}") # pads 0
print(f"Price 2 is = ${price2:15}")  # pads free spaces
print(f"Price 3 is = ${price3:010}") # pads 0

# Adding alignments

print(f"Price 1 is = ${price1:<20}") # Left   alignment
print(f"Price 2 is = ${price2:>15}") # Right  alignment
print(f"Price 3 is = ${price3:^10}") # Center alignment

# Adding "+" or "-" 

print(f"Price 1 is = ${price1:+}") # adds a + sign
print(f"Price 2 is = ${price2:+}") # adds a + sign
print(f"Price 3 is = ${price3:+}") # adds a + sign

# Adding a "," 

print(f"Price 1 is = ${price1:,}") # adds a ,
print(f"Price 2 is = ${price2:,}") # adds a ,
print(f"Price 3 is = ${price3:,}") # adds a ,

# Adding multiple flags

print(f"Price 1 is = ${price1:+,.2f}") # adds a + sign, decimal places of 2 places and a comma
print(f"Price 2 is = ${price2:+,.3f}") # adds a + sign, decimal places of 3 places and a comma
print(f"Price 3 is = ${price3:+,.5f}") # adds a + sign, decimal places of 5 places and a comma