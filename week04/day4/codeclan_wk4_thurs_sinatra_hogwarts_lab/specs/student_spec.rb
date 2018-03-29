# student_spec.rb
require('pry-byebug')
require("minitest/autorun")
require("minitest/reporters")
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative("../models/student.rb")

class TestStudent < MiniTest::Test

  def setup
    @harry = Student.new({
      'first_name' => 'Harry',
      'second_name' => 'Potter',
      'house' => 'Gryffindor',
      'age' => '12'
      })
  end

  def test_student_has_first_name
    assert_equal('Harry', @harry.first_name)
  end

  def test_student_has_second_name
    assert_equal('Potter', @harry.second_name)
  end

  #this is db method so can't be tested directly
  def test_student_saved_to_db
    @harry.save()
    # binding.pry
    # nil
  end

end


























# student_spec.rb
