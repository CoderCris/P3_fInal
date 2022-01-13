def solve_memoization(number, asc_combinations):

    mem = {}

    def fill_mem(n, m):

        key = str(n)+str("-")+str(m)

        if mem.__contains__(key):
            return mem[key]

        if n == 0 or m >= n:
            return 0

        if m == 0:
            return 1

        mem[key] = ((n-m) * fill_mem(n-1, m-1)+(m+1) * fill_mem(n-1, m))
        return mem[key]

    fill_mem(number, asc_combinations)
    key = str(number)+str("-")+str(asc_combinations)
    return mem[key]
