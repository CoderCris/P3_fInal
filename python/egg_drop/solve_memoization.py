from collections import defaultdict

def solve_memoization(eggs, floors):

    #Declaro el contenedor de memoria
    #defaultdic es un diccionario que devuelve un valor predefinido cuando no se
    #encuentra la clave solicitada

    mem = defaultdict(lambda: "NaN")

    def egg_drop(n, k):

        #si el valor ha sido calculado, se usa
        print(mem[n][k])
        if mem[n][k] != 'NaN':
            return mem[n][k]

        #si solo queda un huevo, solo nos queda probar todos los pisos
        if n == 1:
            return k

        #si solo hay un o ningun piso, solo podemos hacer una acción
        if (k == 1 or k == 0):
            return 1

        #para todos los pisos, buscamos el peor de los casos, esto es...
        for x in range(1, k + 1):

            """ 
            Para todo piso ocurrirá que:
                - el huevo se rompe (n-1):
                    calculamos los intentos suponiendo que el piso correcto esté más abajo (piso actual (x) - 1)
                    
                - el huevo NO se rompe (n):
                    calculamos los intentos suponiendo que el piso correcto esté más arriba 
                    (total de pisos (k) - pisos previo(x))
            """
            res = max(egg_drop(n - 1, x - 1), egg_drop(n, k - x))
            mem[n][k] = res + 1
            return min + 1

    egg_drop(eggs, floors)
    return mem[eggs][floors]
