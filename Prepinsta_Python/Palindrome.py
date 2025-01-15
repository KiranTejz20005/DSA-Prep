num= int(input("Enter a number: "))

reversed_num = int(str(num)[::-1])
print(reversed_num)

if num==reversed_num:
    print(f"the {num} is palindrome")
else:
    print(f"the {num} is not a palindrome")
