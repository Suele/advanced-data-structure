from BubbleSort import BubbleSort

list1 = [10,9, 7, 4, 6, 3, 8, 1]
list2 = [4, 2, 3, 4]

bubbleSort = BubbleSort(list1)
print("Lista sem ordenar: ", list1)
print("lista ordenada: ", bubbleSort.sort())
print("contador: ", bubbleSort.counter())
