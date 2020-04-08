class Controller:
    def __init__(self, date):
        self.date = date

    def anoBissexto(self):
        if self.date.year % 100 == 0 or self.date.year % 400 == 0 or self.date.year % 4 == 0:
            print("É ano Bissexto", self.date.year)
        else:
            print("Não é um ano Bissexto", self.date.year)

    def verificaData(self):
        if self.date.day >= 1 or self.date.day <= 31 or self.date.month >= 1 or self.date.month <= 12 or self.date.year > 1970:
            print("Data é valida:", self.date.day, "/", self.date.month, "/", self.date.year)
        else:
            print("Data inválida")

    def datasIguais(self, date1, date2):
        print(date1.day)
        print(date2.day)

    def dataDaPascoa(self):
        if self.date.year >= 1582 or self.date.year >= 1699:
            x = 22
            y = 2

        if self.date.year >= 1700 or self.date.year >= 1799:
            x = 23
            y = 3

        if self.date.year >= 1800 or self.date.year >= 1899:
            x = 23
            y = 4

        if self.date.year >= 1900 or self.date.year >= 2099:
            x = 24
            y = 5

        if self.date.year >= 2100 or self.date.year >= 2199:
            x = 24
            y = 6

        if self.date.year >= 2200 or self.date.year >= 2299:
            x = 25
            y = 7

        a = (self.date.year % 19)
        b = (self.date.year % 4)
        c = (self.date.year % 7)
        d = ((19 * a) + x) % 30
        e = ((2 * b) + (4 * c) + (6 * d) + y) % 7

        if d + e < 10:
            print("Data da Páscoa:", int(d + e + 22), "de Março em", self.date.year)
        else:
            print("Data da Páscoa:", int(d + e - 9), "de Abril em", self.date.year)
