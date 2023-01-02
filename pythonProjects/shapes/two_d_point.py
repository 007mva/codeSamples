from typing import List


class TwoDPoint:

    def __init__(self, x, y) -> None:
        self.__x = x
        self.__y = y

    @property
    def x(self):
        return self.__x

    @property
    def y(self):
        return self.__y

    def __eq__(self, other: object) -> bool:
        if self.x == other.x and self.y == other.y:
            return True
        else:
            return False  # TODO

    def __ne__(self, other: object) -> bool:
        return not self.__eq__(other)

    def __str__(self) -> str:
        return '(%g, %g)' % (self.__x, self.__y)

    # TODO: add magic methods such that two TwoDPoint objects can be added and subtracted coordinate-wise just by using
    #  syntax of the form p + q or p - q

    def __add__(self, other: object):
        x_value = self.x + other.x
        y_value = self.y + other.y
        return TwoDPoint(x_value,y_value)

    def __sub__(self, other: object):
        x_value = self.x - other.x
        y_value = self.y - other.y
        return TwoDPoint(x_value,y_value)


    @staticmethod
    def from_coordinates(coordinates: List[float]):
        if len(coordinates) % 2 != 0:
            raise Exception("Odd number of floats given to build a list of 2-d points")
        points = []
        it = iter(coordinates)
        for x in it:
            points.append(TwoDPoint(x, next(it)))
        return points



if __name__ == '__main__':

    points = TwoDPoint.from_coordinates([2,2,2,2,5,6])
    x = points[0]
    y = points[1]
    print("X :",x)
    print("Y :",y)
    print("Is x and y equal?      : ",x==y)
    print("Is x and y not equal?  : ",x!=y)
    print("X + Y gives            : ",x+y)
    print("X - Y gives            : ",x-y)