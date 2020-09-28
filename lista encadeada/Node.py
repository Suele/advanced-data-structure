class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


node1 = Node(5)
node2 = Node(9)
node3 = Node(12)

# print(node1.data)

node1.next = node2
node2.next = node3

# print(node1.next.data)
# print(node2.next.data)
