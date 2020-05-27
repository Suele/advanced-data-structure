class BubbleSort:

    def __init__(self, listNumbers):
        self.listNumbers = listNumbers
        self.count = 0

    def sort(self):
        n = len(self.listNumbers)
        for j in range(n - 1):
            for i in range(n - 1):
                if self.listNumbers[i] > self.listNumbers[i + 1]:
                    aux = self.listNumbers[i + 1]
                    self.listNumbers[i + 1] = self.listNumbers[i]
                    self.listNumbers[i] = aux
                    print(">>>", self.listNumbers)
                    self.count += 1
        return self.listNumbers

    def counter(self):
        return self.count
