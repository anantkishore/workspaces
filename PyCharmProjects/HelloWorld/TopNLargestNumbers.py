import _heapq


def find_largest_k(k, numbers):
    if k == 0:
        return
    heap = numbers[:k]
    _heapq.heapify(heap)
    for i in numbers[k:]:
        if heap[0] < i:
            _heapq.heapreplace(heap, i)
    return heap


print(find_largest_k(4, [3,1,4,1,5,9,2,6,5,3,5,8]))

