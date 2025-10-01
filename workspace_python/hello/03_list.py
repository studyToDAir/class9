a = ['영', '일', '이', '삼', '사']
print(a[-0]) # -0은 0
print(a[-1])
print(a[-2]) # 음수는 뒤에서부터

b = 'abcdef'
print( b[2] ) # 문자열도 배열 취급한다

c = [1,2,3,4]
# 배열 초기화
c = []
c = list()

# 슬라이싱
print( 1, a[0:2] )  # 0부터 2 바로 앞 
print( 2, a[1:2] )
print( 3, a[1:20] )     # 마지막 index가 커도 배열의 끝까지만
print( 4, a[10:20] )    # 에러 없음
print( 5, a[100:20] )   # 에러 없음

print( 6, a[1:])    # 끝까지
print( 7, a[:3])    # 처음부터

print(8, a[100]) # list index out of range

d = ['오', '육', '칠']

print(a + d)
print(a * 3)
print( len(a) )
# print( 1 + "a")
# print( "a" + 1 )
print( "a" + str(1) )

del a[1]    # 지우기
print(a)

# range
## range(시작숫자, 종료숫자, step)
## 시작 숫자 부터 종료 숫자 바로 앞까지 step씩 증가하면서
r = range(10) # 전달인자 하나인 경우 0부터 10바로 전까지 1씩 증가
print(1, r)
print(2, list(r))
print(3, list( range(4, 10, 2) ))
print(3, list( range(40, 10, 2) )) # 종료가 크면 비어있음
print(3, list( range(40, 10, -2) )) # step은 음수 가능


