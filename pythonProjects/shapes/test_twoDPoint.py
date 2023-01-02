from unittest import TestCase
from two_d_point import TwoDPoint

class TestTwoDPoint(TestCase):

    def test_from_coordinates(self):
        self.assertRaises(Exception,lambda:TwoDPoint.from_coordinates([1,2,3,4,5]))
        # TODO
