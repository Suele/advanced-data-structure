from dateStruct import DateStruct

day = input("Digite o dia desejado: ")
month = input("Digite o mês desejado: ")
year = input("Digite o ano desejado: ")

print(" ")

try:
    date = DateStruct(int(day), int(month), int(year))
    date.anoBissexto()
    date.verificaData()
    date.dataDaPascoa()
except:
    print("Algum ou todos os dados inseridos não são números")
