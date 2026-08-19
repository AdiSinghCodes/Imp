size = int(input("Enter size"))
list = []
for i in range(size):
    list.append(int(input(i)))
    i+=1

print(list)


i = 0
n = len(list)
        

while i+1 < n and list[i] < list[i+1]:
    i+=1

        if i==0:
            return False

        p = i

        while i+1<n and nums[i] > nums[i+1]:
            i+=1

        if p==i:
            return False

        q = i

        while i+1<n and nums[i] < nums[i+1]:
            i+=1

        if q==i:
            return False

        return i==n-1