from unittest import TestCase
from rectangle import Rectangle


class TestRectangle(TestCase):
    def test_center(self):
        rect = Rectangle(1, 3, 2, 1, 3, 5, 4, 3)
        center = rect.center()
        x = center.x
        y = center.y
        tup = x,y
        self.assertEqual(tup,(2.5,3))

    def test_area(self):
        rect = Rectangle(1, 3, 2, 1, 3, 5, 4, 3)
        self.assertEqual(round(rect.area(),6),6.324555)