class DateStruct:
    def __init__(self, day, month, year):
        self.day = day
        self.month = month
        self.year = year

    def anoBissexto(self):
        if self.year % 100 == 0 or self.year % 400 == 0 or self.year % 4 == 0:
            print("É ano Bissexto", self.year)
        else:
            print("Não é um ano Bissexto", self.year)

    def verificaData(self):
        if self.day >= 1 or self.day <= 31 or self.month >= 1 or self.month <= 12 or self.year > 1970:
            print("Data é valida:", self.day, "/", self.month, "/", self.year)
        else:
            print("Data inválida")

    def dataDaPascoa(self):
        if self.year >= 1582 or self.year >= 1699:
            x = 22
            y = 2

        if self.year >= 1700 or self.year >= 1799:
            x = 23
            y = 3

        if self.year >= 1800 or self.year >= 1899:
            x = 23
            y = 4

        if self.year >= 1900 or self.year >= 2099:
            x = 24
            y = 5

        if self.year >= 2100 or self.year >= 2199:
            x = 24
            y = 6

        if self.year >= 2200 or self.year >= 2299:
            x = 25
            y = 7

        a = (self.year % 19)
        b = (self.year % 4)
        c = (self.year % 7)
        d = ((19 * a) + x) % 30
        e = ((2 * b) + (4 * c) + (6 * d) + y) % 7

        if d + e < 10:
            print("Data da Páscoa:", int(d + e + 22), "de Março em", self.year)
        else:
            print("Data da Páscoa:", int(d + e - 9), "de Abril em", self.year)