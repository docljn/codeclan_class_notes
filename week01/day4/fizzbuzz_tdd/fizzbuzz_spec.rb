# fizzbuzz_spec.rb

require("minitest/autorun")
require("minitest/rg")

require_relative("fizzbuzz.rb")

# initial solution is just to return "Fizz" as that checks the function is actually returning something!

class FizzBuzzSpec < MiniTest::Test
  #classes are named in PascalCase

  def test_takes_an_input
    fizzbuzz(0)
  end

  # divisible by three
  def test_3_returns_fizz
    actual    = fizzbuzz(3)
    expected  = "Fizz"
    assert_equal(expected, actual)
  end

  def test_6_returns_fizz
    assert_equal("Fizz", fizzbuzz(6))
  end


  # divisible by five
  def test_5_returns_buzz
    assert_equal("Buzz", fizzbuzz(5))
  end

  def test_10_returns_buzz
    assert_equal("Buzz", fizzbuzz(10))
  end

  # divisible by three and five
  def test_15_returns_fizzbuzz
    actual    = fizzbuzz(15)
    expected  = "FizzBuzz"
    assert_equal(expected, actual)
  end

  def test_30_returns_fizzbuzz
    actual    = fizzbuzz(30)
    expected  = "FizzBuzz"
    assert_equal(expected, actual)
  end

  def test_0_returns_fizzbuzz #edge case - expected behaviour
    actual    = fizzbuzz(0)
    expected  = "FizzBuzz"
    assert_equal(expected, actual)
  end
  


  # integers
  def test_7_returns_7_as_string
    actual    = fizzbuzz(7)
    expected  = "7"
    assert_equal(expected, actual)
  end


end
