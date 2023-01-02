from rectangle import Rectangle
from quadrilateral import Quadrilateral


class Square(Rectangle):

    def __init__(self, *floats):
        super().__init__(*floats)
        if not self.__is_member():
            raise TypeError("A square cannot be formed by the given coordinates.")

    def __is_member(self):
        '''This method will make sure that the vertices form a square by checking if the distance of all sides is equal or not'''
        lengths = self.side_lengths()

        if lengths[0] == lengths[1] == lengths[2] == lengths[3]:
            return True
        else:
            return False

    def snap(self):
        """Snaps the sides of the square such that each corner (x,y) is modified to be a corner (x',y') where x' is the
        integer value closest to x and y' is the integer value closest to y. This, of course, may change the shape to a
        general quadrilateral, hence the return type. The only exception is when the square is positioned in a way where
        this approximation will lead it to vanish into a single point. In that case, a call to snap() will not modify
        this square in any way."""
        p_1 = self.vertices[0]
        p_2 = self.vertices[1]
        p_3 = self.vertices[2]
        p_4 = self.vertices[3]
        x_1,y_1 = int(p_1.x),int(p_1.y)
        x_2,y_2 = int(p_2.x),int(p_2.y)
        x_3,y_3 = int(p_3.x),int(p_3.y)
        x_4,y_4 = int(p_4.x),int(p_4.y)

        if x_1==x_2==x_3==x_4 and y_1==y_2==y_3==y_4:
            return self
        else:
            return Quadrilateral(p_1.x,p_1.y,p_2.x,p_2.y,p_3.x,p_3.y,p_4.x,p_4.y)  # TODO

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
        Square:-
        point_1 : {} 
        point_2 : {}
        point_3 : {}
        point_4 : {}
        '''.format(str(self.vertices[0]),str(self.vertices[1]),str(self.vertices[2]),str(self.vertices[3]))

if __name__ == '__main__':
    square = Square(1.2,1.2,1.6,1.6,1.2,1.6,1.6,1.2)
    print(str(square))
    snapped = square.snap()

