from AlgorithmSort import AlgorithmSort

list1 = [10,9, 7, 4, 6, 3, 8, 1, 5, 2]
list2 = [1, 2, 3, 4, 5, 6, 10, 9, 8, 7]

algorithmSort = AlgorithmSort(list2)
print("Lista sem ordenar: ", list2)
print("lista ordenada bubbleSort: ", algorithmSort.bubbleSort())
print("contador bubbleSort: ", algorithmSort.counter())

