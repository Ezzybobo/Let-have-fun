sum = 0
average = 0
for counter in range (1,11):
    score = int(input("Enter 10 Scores: "))
    if score>=0 and score<=100 :
	    sum += score
	    average = sum / 10
print("Sum = ", sum)
print("Average = ", average)
