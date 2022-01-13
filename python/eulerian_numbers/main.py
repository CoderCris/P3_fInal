from solve_memoization import *
from solve_tabulation import *

#cogemos la info de un fichero externo

eggs = 0
floors = 0
with open('./dataset/1.txt') as file:
    descriptor = file.readline().split()
    number = int(descriptor[0])
    asc_combinations = int(descriptor[1])

print(str("Eularian number of A(") + str(number) + str(", ") + str(asc_combinations) + str(") is:"))
print(str("Memoization -> ")+str(solve_memoization(number, asc_combinations)))
print(str("Tabulation -> ")+str(solve_tabulation(number, asc_combinations)))

