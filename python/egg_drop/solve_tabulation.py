import sys

def solve_tabulation(eggs, floors):
    tab = [[0 for x in range(floors + 1)] for x in range(eggs + 1)]

    for x in range(1, floors+1):
        tab[1][x] = x

    for x in range(1, eggs+1):
        tab[x][0] = 0
        tab[x][1] = 1



    #bucle huevos
    for n in range(2, eggs+1):
        #bucle pisos
        for k in range(2, floors+1):
            tab[n][k] = sys.maxsize
            res = sys.maxsize

            for x in range(1, k):
                res = min(res, 1+max(tab[n-1][x-1], tab[n][k-x]))

            tab[n][k] = res

    return tab[eggs][floors]