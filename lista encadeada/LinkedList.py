from Node import Node


class LinkedList:
    def __init__(self):
        self._header = None
        self._end = None
        self._size = 0

    # adiciona no fim da lista
    def addItem(self, element):
        # Se a lista não está vazia.
        if self._header:
            self._end = Node(element)
            self._header.next = self._end
            self._size += 1

            while self._header.data:
                print(self._header.data)
                self._header = self._header.next
        else:
            # Se lista está vazia.
            node = Node(element)
            self._header = node
            self._size += 1

    def listSize(self):
        return self._size

    def mostra(self):
        print()
        while self._header:
            print(self._header.data, "\n")
            self._header = self._header.next + 1


list1 = LinkedList()
print(list1.addItem(100))
print(list1.addItem(101))
print(list1.addItem(115))
print("Tamanho da lista:", list1.listSize())
print(list1.mostra())