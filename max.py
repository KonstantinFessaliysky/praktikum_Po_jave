def lesson2(numbers):
    m = -10**12
    for i in range(len(numbers)):
        if numbers[i]>m:
            m = numbers[i]
    return m
