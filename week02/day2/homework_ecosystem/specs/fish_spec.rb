# fish_spec.rb
require("minitest/autorun")
require "minitest/reporters"
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative("../fish")

class TestFish < MiniTest::Test
# TEST FUNCTION NAMING
# must start with "test_"
  def setup
    @carp = Fish.new("carp")
  end


  def test_fish_has_name
    assert_equal("carp", @carp.name)
  end


end
# end fish_spec.rb
