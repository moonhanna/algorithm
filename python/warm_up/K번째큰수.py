#1~100 N장의 카드, 3장을 뽑아 각 카드 합한 값 기록, 기록한 값 중 K번째로 큰 수 출력
import sys
n, k = map(int, input().split())
a = list(map(int, input().split()))
res=set() # set -> 중복제거
for i in range(n):
    for j in range(i+1, n):
        for m in range(j+1, n):
            res.add(a[i]+a[j]+a[m])
res=list(res)
res.sort(reverse=True) # 내림차순
#print(res)
print(res[k-1])