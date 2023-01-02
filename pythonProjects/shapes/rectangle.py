from quadrilateral import Quadrilateral
from two_d_point import TwoDPoint


class Rectangle(Quadrilateral):

    def __init__(self, *floats):
        super().__init__(*floats)
        if not self.__is_member():
            raise TypeError("A rectangle cannot be formed by the given coordinates.")

    def __is_member(self):
        """Returns True if the given coordinates form a valid rectangle, and False otherwise."""
        lengths = self.side_lengths()

        if lengths[0]==lengths[2] and lengths[1]==lengths[3]:
            return True
        else:
            return False  # TODO

    def center(self):
        """Returns the center of this rectangle, calculated to be the point of intersection of its diagonals."""
        p_1 = self.vertices[0]
        p_2 = self.vertices[1]
        p_3 = self.vertices[2]
        p_4 = self.vertices[3]

        add = p_1 + p_2 + p_3 + p_4

        return TwoDPoint(add.x / 4, add.y / 4)  # TODO

    def area(self):
        """Returns the area of this rectangle. The implementation invokes the side_lengths() method from the superclass,
        and computes the product of this rectangle's length and width."""
        lengths = self.side_lengths()
        area = lengths[0]*lengths[1]
        return area  # TODO

    def __eq__(self, other:object):
        other_vertices = other.vertices
        count = 0
        for each in self.vertices:
            for each2 in other_vertices:
                if each == each2:
                    count+=1
        if count==4:
            return True
        else:
            return False

    def __ne__(self, other:object):
        return not self.__eq__()

    def __str__(self):
        return '''
        Rectangle:-
        point_1 : {} 
        point_2 : {}
        point_3 : {}
        point_4 : {}
        '''.format(str(self.vertices[0]),str(self.vertices[1]),str(self.vertices[2]),str(self.vertices[3]))

if __name__ == '__main__':
    rect = Rectangle(1,3,2,1,3,5,4,3)
    print(str(rect))
    print("Centre of above rectangle : ",rect.center())
    print("Area of above rectangle   : ",rect.area())