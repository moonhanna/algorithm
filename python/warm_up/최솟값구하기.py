#최솟값 구하기
arr=[5, 3, 7, 9, 2, 5, 2, 6]
arrMin=arr[0]
'''
for i in range(len(arr)):
    if arr[i]<arrMin:
        arrMin=arr[i]
print(arrMin)
'''
for x in arr:
    if x<arrMin:
        arrMin=x
print(arrMin)