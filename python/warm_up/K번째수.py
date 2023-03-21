# N개의 숫자열에서 s번째부터 e번째 까지의 수를 오름차순 정렬했을 때 k번째 수
import sys
T = int(input())
for t in range(T):
    n, s, e, k = map(int, input().split())
    a = list(map(int, input().split()))
    a=a[s-1:e]
    a.sort()
    print("#%d %d" %(t+1, a[k-1]))