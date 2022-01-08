from solve_memoization import *
from solve_tabulation import *

#cogemos la info de un fichero externo

eggs = 0
floors = 0
with open('./dataset/1.txt') as file:
    descriptor = file.readline().split()
    eggs = int(descriptor[0])
    floors = int(descriptor[1])


print(solve_memoization(eggs, floors))


