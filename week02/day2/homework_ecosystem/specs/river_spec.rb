# river_spec.rb
require("minitest/autorun")
require "minitest/reporters"
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative("../river")
require_relative("../fish")

class TestRiver < MiniTest::Test
# TEST FUNCTION NAMING
# must start with "test_"
  def setup
    @amazon = River.new("Amazon")

    @perch = Fish.new("perch")
    @carp = Fish.new("carp")
    @loach = Fish.new("loach")
    @bream = Fish.new("bream")
    @trout = Fish.new("trout")
    @salmon = Fish.new("salmon")

    @tay = River.new("Tay", @perch, @carp, @loach, @bream, @trout, @salmon)


  end

  def test_river_has_name
    expected = "Amazon"
    output = @amazon.name
    assert_equal("Amazon", output)
  end

  def test_river_has_fish
    @tay.count_fish
    expected = 6
    output = @tay.count_fish
    assert_equal(expected, output)
  end

  def test_stock_river_adds_fish
    @amazon.stock_river(@perch)
    expected = 1
    output = @amazon.count_fish
    assert_equal(expected, output)
  end

  def test_remove_fish_reduces_fish_count
    @amazon.stock_river(@salmon)
    @amazon.stock_river(@bream)
    @amazon.remove_fish(@salmon)
    expected = 1
    output = @amazon.count_fish
    assert_equal(expected, output)
  end

  def test_sample_contents_returns_fish
    # better not to check the class of the object
    # test may not be specific enough
    @amazon.stock_river(@salmon)
    result = @amazon.sample_contents.name
    expected = "salmon"
    assert_equal(expected, result)
  end

  # consider adding a test to make sure that taking a fish
  # from an empty river has no effect on bear or river.



end
# end river_spec.rb
