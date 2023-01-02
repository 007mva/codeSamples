from square import Square
from rectangle import Rectangle
from quadrilateral import Quadrilateral

class ShapeSorter:
    @staticmethod
    def sort(*quads):
        quadrilaterals = list(quads)
        list_with_small_x = [[each,each.smallest_x()] for each in quadrilaterals]

        sort = sorted(list_with_small_x, key=lambda x:x[1])
        return_list = []
        for each in sort:
            return_list.append(each[0])
        return return_list



if __name__ == '__main__':
    square = Square(3, 3, 5, 5, 3, 5, 5, 3)
    rect = Rectangle(1, 3, 2, 1, 3, 5, 4, 3)
    x = Quadrilateral(0, 1, 5, 1, 5, 3, 1, 3)
    sorted_shapes = ShapeSorter.sort(rect,square,x)
    print(square)
    print(rect)
    print(x)
    print("Sorted according to smallest x : ")
    for each in sorted_shapes:
        print(each)
