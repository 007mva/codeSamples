from unittest import TestCase
from quadrilateral import Quadrilateral

class TestQuadrilateral(TestCase):

    def test_side_lengths(self):
        '''This will test a rectangle which is rotated to some degree to see if the lengths are still calculated the way they are supposed to be'''
        test = Quadrilateral(1, 1, 5, 1, 5, 3, 1, 3)
        self.assertEqual(test.side_lengths(),(4.0,2.0,4.0,2.0))
        # self.fail()  # TODO

    def test_smallest_x(self):
        '''This will test if the smallest x is returned or not, the smallest x in our example case being 1'''

        test2 = Quadrilateral(1, 1, 5, 1, 5, 3, 1, 3)
        self.assertEqual(test2.smallest_x(),1)
        # self.fail()  # TODO
