require "minitest/autorun"
require "minitest/rg"
require_relative ("../codeclan_student")

class TestCodeclanStudent < Minitest::Test

  def setup
    @student = Student.new("Nancy", 12)
    @student2 = Student.new("Jean", "18")
  end


  def test_student_name
    student = Student.new("Trevor", 18)
    assert_equal("Trevor",  student.name)
  end

  def test_cohort_number
    student = Student.new("Trevor", 18)
    assert_equal(18,  student.cohort)
  end

  def test_set_student_name
    @student.name=("Elizabeth")
    assert_equal("Elizabeth", @student.name)
  end

  def test_set_cohort_number
    @student.cohort_number=(21)
    assert_equal(21, @student.cohort) #using the getter method
  end

  def test_student_speaks
    assert_equal("I can talk", @student2.speaks)
  end

  def test_say_favourite_language
    result = @student.say_favourite_language("Ruby")
    assert_equal("I love Ruby", result)
  end
end
