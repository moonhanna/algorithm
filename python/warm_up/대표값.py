# N명의 학생들의 평균(소수 첫째자리 반올림), 가장 가까운 학생 몇번째인지 출력
import sys

n = int(input())
a = list(map(int, input().split()))

ave = round(sum(a)/n) # 소수 첫째자리 반올림

min=1000 # 큰 수

for idx, x in enumerate(a): # list의 인덱스 값과 실제 값 리턴
    tmp=abs(x-ave) # 절대값
    if tmp<min:
        min=tmp
        score=x
        res=idx+1
    elif tmp==min:
        if x>score:
            score=x
            res=idx+1
print(ave, res)    