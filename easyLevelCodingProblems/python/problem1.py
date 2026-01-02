"""
Create a program that takes a string as input and prints the first non-repeating character in the string. If all characters repeat, print `-1`.
"""

s=list(input("Enter the string:"))
noNonRepeatedCharFound=False
for ch in s:
    count=s.count(ch)
    if count==1:
        print(f"first non repeated char: {ch}!")
        break
    noNonRepeatedCharFound=True


if noNonRepeatedCharFound==True:
    print("-1!")

