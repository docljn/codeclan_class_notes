# car_spec.rb

require("minitest/autorun")
require "minitest/reporters"
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative("../car.rb")

class TestCar < Minitest::Test

  def setup
    @car = Car.new(4, "green")
  end

  def test_car_can_start_engine
    assert_equal("Vrrrmmm", @car.start_engine)
  end

  def test_car_has_four_wheels
    assert_equal(4, @car.number_of_wheels())
  end

  def test_car_has_colour
    assert_equal("green", @car.colour)
  end

end
