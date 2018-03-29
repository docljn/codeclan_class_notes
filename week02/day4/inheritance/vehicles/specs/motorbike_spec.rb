# motorbike_spec.rb

require("minitest/autorun")
require "minitest/reporters"
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative("../motorbike.rb")

class TestMotorbike < Minitest::Test

  def setup
    @motorbike = Motorbike.new()
  end

  def test_motorbike_can_start_engine
    assert_equal("Vrrrmmm, I'm a motorbike!", @motorbike.start_engine)
  end

  def test_motorbike_has_two_wheels
    assert_equal(2, @motorbike.number_of_wheels())
  end

end

# motorbike_spec.rb
