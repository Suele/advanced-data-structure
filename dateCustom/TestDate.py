from DateStruct import DateStruct
from Controller import Controller

day = input("Digite o dia desejado: ")
month = input("Digite o mês desejado: ")
year = input("Digite o ano desejado: ")

print(" ")

try:
    date = DateStruct(int(day), int(month), int(year))
    controller = Controller(date)
    controller.anoBissexto()
    controller.verificaData()
    controller.dataDaPascoa()

    print(" ")

    day = input("Digite o dia desejado: ")
    month = input("Digite o mês desejado: ")
    year = input("Digite o ano desejado: ")
    date1 = DateStruct(int(day), int(month), int(year))

    print(" ")

    day = input("Digite o dia desejado: ")
    month = input("Digite o mês desejado: ")
    year = input("Digite o ano desejado: ")
    date2 = DateStruct(int(day), int(month), int(year))
    controller.datasIguais(date1, date2)

except:
    print("Algum ou todos os dados inseridos não são números")

