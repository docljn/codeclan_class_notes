# GEMS
require("minitest/autorun")
# require("minitest/rg") [append --rg to end of ruby filename.rb call in terminal]
require "minitest/reporters"
Minitest::Reporters.use!
# FILES
require_relative("../my_functions")

class MyFunctionsTest < MiniTest::Test

  def test_add
    result = add(2, 3)
    assert_equal(5, result)
  end

  def test_subtract
    result = subtract(9, 6)
    assert_equal(3, result)
  end

   def test_multiply()
       multiply_result = multiply( 4, 2 )
       assert_equal( 8, multiply_result )
     end

    def test_divide()
      divide_result = divide( 10, 2 )
      assert_equal( 5, divide_result )
    end

    def test_length_of_string()
      test_string = "A string of length 21"
      length_of_string = length_of_string( test_string )
      assert_equal( 21, length_of_string )
    end
#
    def test_join_string()
      string_1 = "Mary had a little lamb, "
      string_2 = "it's fleece was white as snow"
      joined_string = join_string( string_1, string_2 )
      assert_equal( "Mary had a little lamb, it's fleece was white as snow", joined_string )
    end

    def test_add_string_as_number()
      add_result = add_string_as_number( "1", "2" )
      assert_equal( 3, add_result )
    end

    def test_number_to_full_name()
      first_month_string = number_to_full_month_name( 1 )
      third_month_string = number_to_full_month_name( 3 )
      ninth_month_string = number_to_full_month_name( 9 )
      assert_equal( "January", first_month_string )
      assert_equal( "March", third_month_string )
      assert_equal( "September", ninth_month_string )
    end

    def test_substring()
      first_month_string = number_to_short_month_name( 1 )
      third_month_string = number_to_short_month_name( 3 )
      ninth_month_string = number_to_short_month_name( 9 )
      assert_equal( "Jan", first_month_string )
      assert_equal( "Mar", third_month_string )
      assert_equal( "Sep", ninth_month_string )
    end


    # Further

    #Given the length of a side of a cube calculate the volume
    def test_volume_of_cube()
      result = volume_of_cube(2)
      assert_equal(8, result)
    end

    #Given the radius of a sphere calculate the volume
    def test_volume_of_sphere()
      # result = volume_of_sphere(2).round(2)
      # assert_equal(33.51, result)
      # use assert_in_delta to compare floats
      result = volume_of_sphere(2)
      assert_in_delta(33.51, result, 0.01)
    end
#
    #Given a value in farenheit, convert this into celsius.
    def test_fahrenheit_to_celsius()
      result = fahrenheit_to_celsius(100)
      assert_in_delta(37.8, result, 0.1)
    end
 end
