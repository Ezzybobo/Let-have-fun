sum = 0

for counter in range (1,11):
    score = int(input("Enter 10 Scores: "))
    if score>=0 and score<=100 :
        if counter % 2 == 0:
            sum += score
print("Sum = ", sum)

