from DateStruct import DateStruct
from Controller import Controller

print("Digite 0 para finalizar o programa.")
print("Digite 1 para verificar se o ano é Bissexto.")
print("Digite 2 para verificar se a data é valida.")
print("Digite 3 para verificar a data da Páscoa.")
print("Digite 4 para verificar se as datas são iguais.")
print("")
opcao = int(input(">>>>>> "))

while opcao != 0 and opcao > 0 and opcao <= 4:

    try:
        day = input("Digite o dia desejado: ")
        month = input("Digite o mês desejado: ")
        year = input("Digite o ano desejado: ")

        date1 = DateStruct(int(day), int(month), int(year))
        controller = Controller(date1)

        if opcao == 1:
            controller.anoBissexto()
        if opcao == 2:
            controller.verificaData()
        if opcao == 3:
            controller.dataDaPascoa()
        if opcao == 4:
            print(" ")
            print("Digite outra data para comparar")
            day = input("dia: ")
            month = input("mês: ")
            year = input("ano: ")
            date2 = DateStruct(int(day), int(month), int(year))
            controller.datasIguais(date1, date2)
        opcao = int(input(">>>>>> "))
    except:
        print("Algum ou todos os dados inseridos não são números")

opcao = +1
