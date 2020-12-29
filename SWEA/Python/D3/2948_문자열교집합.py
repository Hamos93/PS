T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())

    word_set1 = set(list(input().split()))
    word_set2 = set(list(input().split()))

    cnt = len(word_set1.intersection(word_set2))

    print('#{0} {1}'.format(test_case, cnt))