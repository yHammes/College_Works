value: int = 1089

notas_100 = value // 100
print(f"Notas de R$ 10,000: {notas_100}")
value = value % 100

notas_50 = value // 50
print(f"Notas de R$ 50,00: {notas_50}")
value = value % 50

notas_10 = value // 10
print(f"Notas de R$ 10,00: {notas_10}")
value = value % 10

notas_5 = value // 5
print(f"Notas de R$ 5:,00 {notas_5}")
value = value % 5

notas_2 = value // 2
print(f"Notas de R$ 2:,00 {notas_2}")
value = value % 2


# notas_1 = value // 1
# print(f"Notas de R$ 1:,00 {notas_1}")
# value = value % 1