import unittest
from Cake import Cake # works as long as everything is in the same directory
# self.name makes something an instance variable i.e. accessible throughout the class Ruby @name, Java this.name

class TestCake(unittest.TestCase):

    def setUp(self):
        ingredients = ["Sugar", "Flour", "Chocolate"]
        self.cake = Cake("Brownie", ingredients, 5)

    def test_cake_has_name(self):
        self.assertEquals("Brownie", self.cake.name)

    def test_can_bake_itself(self):
        self.assertEquals("The Brownie is baking", self.cake.bake())

# you have to explicitly run the tests, where minitest autorun ran them
unittest.main()


# self invokes an instance variable or method
# Django, Flask are Python frameworks
