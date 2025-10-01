money = 10000

# if (money > 10000) {
# print('택시탐')    
# }

if money > 10000 :
    print('택시 호출')
    print('택시탐')
elif money >= 5000 :
    print('자전거탐')
else :
    print('버스탐')

# if(money == 10000){
#     // 나중에 미래의 내가 할꺼임
# }
if money == 10000 :
    pass

탈것 = "택시" if money > 10000 else "뚜벅이"
print(탈것)

# print = ''
# print(1)
print('-'*20)
diner = ['회', '흑염소탕', '쉐이크']
for menu in diner :
    print(menu)

for i, menu in enumerate(diner) :
    print(i, menu)

print('-'*20)
for i in range(2, 11):
    print(i)

rank = [1,2,3,4,5]
result = [  i*2  for i in rank if i%2 == 0   ]
# rank의 값 하나씩 i에 넣고
# 그 값이 짝수라면
# 배열에 추가한다
print(result)

# switch 없음
# 파이썬 3.10 이상에 match
val = 'c'
match val :
    case 'a' :
        print('AA')
    case 'b' :
        print('BB')
    case 'c' :
        print('CC')
    case _ :            # _  가 default
        print('default')
