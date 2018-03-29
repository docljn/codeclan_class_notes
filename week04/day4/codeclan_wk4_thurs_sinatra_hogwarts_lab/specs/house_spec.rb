# house_spec.rb
require('pry-byebug')
require("minitest/autorun")
require("minitest/reporters")
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative("../models/house.rb")

class TestHouse < MiniTest::Test

def setup
  @gryffindor = House.new({'name' => 'Gryffindor'})
  
end

  def test_house_has_name()
    assert_equal('Gryffindor', @gryffindor.name)
  end
end
