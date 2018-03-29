class Cake:
    def __init__(self, name, ingredients, rating):
        self.name = name
        self.ingredients = ingredients
        self.rating = rating

    def bake(self):
        return "The " + self.name + " is baking"


# there is no concept of private properties in Python
# don't touch a private property if it is not meant to be touched!
# to specify that something is to be left alone, use __name__;
# .id should be left alone
# etc.


# the concept of self:
# 4 arguments in init, only 3 are passed in
    # init is NOT a constructor: we already have an empty object
# the empty object is "self"
    # init then initializes the object, and so requires the empty object self along with the arguments
# self is then used to invoke both instance variables and instance methods
# EVERY method MUST take in self

# inheritance in Python is written as:
    # class Subclass(SuperClass):
        # def __init__(self, name, ingredients, rating, choc_content)
            # Cake.__init__(self, name, ingredients, rating)
            # self.choc_content = choc_content

# Python supports multiple inheritance CARE!!!!
