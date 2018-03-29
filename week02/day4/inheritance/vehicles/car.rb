# car.rb
# subclass

# vehicle is superclass, thus need access to file setting up Vehicle class.
require_relative("vehicle.rb")

class Car < Vehicle

  attr_reader :colour

  # # no need to initialize if there are no instance variables
  def initialize(number_of_wheels, colour)
    # MUST list "super" above any other instance variables
    # the super() applies the arguments in order to the
    # super class initialize method
    # the arguments do NOT have to be given the same name
    super(number_of_wheels)
    # colour doesn't exist on the superclass, so initialize here
    @colour = colour
  end

  # no need for a separate start_engine method if inherited
  # def start_engine()
  #   return "Vrrrmmm"
  # end

end


# car.rb
