def lesson2(numbers):
    m = 10**12
    for i in range(len(numbers)):
        if numbers[i]<m:
            m = numbers[i]
    return m

a = int(input())
num = [0]*a
for i in range(a):
    num[i] = int(input())
print(lesson2(num))
