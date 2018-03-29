idea of inheritance is to
 - reduce duplication
 - be able to change many similar classes in the same place

 def initialize
   super(argument)  - passes arguments to superclass initialize method
   MUST be written above any other instance variables in the method
 end

CARE: You don't need to define initialize if there are no changes from the superclass
