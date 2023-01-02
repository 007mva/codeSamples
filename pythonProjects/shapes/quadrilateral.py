from two_d_point import TwoDPoint
import math

class Quadrilateral:

    def __init__(self, *floats):
        points = TwoDPoint.from_coordinates(list(floats))
        self.__vertices = tuple(points[0:4])

    @property
    def vertices(self):
        return self.__vertices

    def side_lengths(self):
        """Returns a tuple of four floats, each denoting the length of a side of this quadrilateral. The value must be
        ordered counterclockwise, starting from the top right  corner."""
        p_1 = self.vertices[0]
        p_2 = self.vertices[1]
        p_3 = self.vertices[2]
        p_4 = self.vertices[3]

        add = p_1 + p_2 + p_3 + p_4
        add = TwoDPoint(add.x/4,add.y/4)
        ordered = []
        for each in self.vertices:
            if each.x >= add.x and each.y >add.y:
                ordered.append(each)
        for each in self.vertices:
            if each.x < add.x and each.y >=add.y:
                ordered.append(each)
        for each in self.vertices:
            if each.x <= add.x and each.y <add.y:
                ordered.append(each)
        for each in self.vertices:
            if each.x > add.x and each.y <=add.y:
                ordered.append(each)

        len_1 = math.sqrt((ordered[1].x-ordered[0].x)**2 + (ordered[1].y-ordered[0].y)**2)
        len_2 = math.sqrt((ordered[2].x-ordered[1].x)**2 + (ordered[2].y-ordered[1].y)**2)
        len_3 = math.sqrt((ordered[3].x-ordered[2].x)**2 + (ordered[3].y-ordered[2].y)**2)
        len_4 = math.sqrt((ordered[0].x-ordered[3].x)**2 + (ordered[0].y-ordered[3].y)**2)


        return len_1,len_2,len_3,len_4  # TODO

    def smallest_x(self):
        """Returns the x-coordinate of the vertex with the smallest x-value of the four vertices of this
        quadrilateral."""
        min = TwoDPoint(99999999999,0)
        for each in self.vertices:
            if each.x<min.x:
                min=each
        return min.x  # TODO

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
        Quadrilateral:-
        point_1 : {} 
        point_2 : {}
        point_3 : {}
        point_4 : {}
        '''.format(str(self.vertices[0]),str(self.vertices[1]),str(self.vertices[2]),str(self.vertices[3]))

if __name__ == '__main__':

    x = Quadrilateral(1,1,5,1,5,3,1,3)
    y = Quadrilateral(5,3,1,1,5,1,1,3)
    print(str(x))
    print("Quadrilateral x and y are equal?    : ",x==y)
    print("Side lengths of above quadrilateral : ",x.side_lengths())
    print("Smallest x in above quadrilaterla   : ",x.smallest_x())