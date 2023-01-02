from unittest import TestCase
from square import Square

class TestSquare(TestCase):
    def test_snap(self):
        '''This square will remain the same because rounding of these float values will convert it to a single point that is 1. Hence, it will return the original square in snap()'''
        square = Square(1.2, 1.2, 1.6, 1.6, 1.2, 1.6, 1.6, 1.2)
        new_square = square.snap()
        self.assertEqual(square,new_square)
