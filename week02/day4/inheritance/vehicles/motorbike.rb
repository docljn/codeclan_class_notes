# motorbike.rb
# subclass

# vehicle is superclass, thus need access to file setting up Vehicle class.
require_relative("vehicle.rb")

class Motorbike < Vehicle

  def initialize
    # no need to provide arguments when initializing
    # the superclass intialize will accept the super(2)
    # instruction.
    super(2)
  end

# no need for a separate start_engine method if inherited
  # def start_engine
  #   return "Vrrmmm"
  # end

# if start_engine is different to the superclass, simply define in subclass
  def start_engine()
    return "Vrrrmmm, I'm a motorbike!"
  end

end

# motorbike.rb
