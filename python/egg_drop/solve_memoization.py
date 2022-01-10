import sys

def solve_memoization(eggs, floors):

    #Declaro el contenedor de memoria
    mem = {}

    def egg_drop(n, k):

        key = str(n) + str("-") + str(k)
        #si el valor ha sido calculado, se usa
        if mem.__contains__(key):
            return mem[key]

        #si solo queda un huevo, solo nos queda probar todos los pisos
        if n == 1:
            return k

        #si solo hay un o ningun piso, solo podemos hacer una acción
        if k <= 1:
            return k

        res = sys.maxsize

        #para todos los pisos, buscamos el peor de los casos, esto es...
        for x in range(1, k + 1):

            res = min(res, 1 + max(egg_drop(n - 1, x - 1), egg_drop(n, k - x)))
            mem[key] = res

        return res

    egg_drop(eggs, floors)
    return mem[str(eggs)+str("-")+str(floors)]
