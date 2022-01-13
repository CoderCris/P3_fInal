def solve_tabulation(number, asc_combinations):
    tab = [[0 for m in range(asc_combinations+1)] for n in range(number+1)]

    for a in range(1, number+1):
        for b in range(0, asc_combinations+1):

            if a > b:
                if b == 0:
                    tab[a][b] = 1
                else:
                    tab[a][b] = ((a-b) * tab[a-1][b-1] + (b+1) * tab[a-1][b])

    return tab[number][asc_combinations]
