num = int(input())
x , m = -1 , 1000000
data = list(map(int, input().split())) 
for i in range(num):
    if x < data[i]:
        x = data[i]
    if data[i] < m:
        m = data[i]
print(m*x)