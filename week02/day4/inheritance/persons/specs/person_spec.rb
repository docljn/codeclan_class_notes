# person_spec.rb

require("minitest/autorun")
require "minitest/reporters"
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative("../person.rb")

class TestPerson < Minitest::Test

  def setup
    @person = Person.new("Miffy", "Rabbit")
  end

  # def test_person_has_names
  #   assert_equal("Miffy", @person.first_name)
  #   assert_equal("Rabbit", @person.last_name)
  # end

  def test_person_talks
    assert_equal("Miffy Rabbit", @person.talks)
  end

end
