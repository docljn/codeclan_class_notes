require("minitest/autorun")
require "minitest/reporters"
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative("../medic.rb")

class TestMedic < Minitest::Test

  def setup
    @medic = Medic.new("Peso", "Penguin")
  end

  # def test_medic_has_names
  #   assert_equal("Peso", @medic.first_name)
  #   assert_equal("Penguin", @medic.last_name)
  # end

  def test_medic_talks
    assert_equal("Peso Penguin", @medic.talks)
  end

  def test_medic_heals
    assert_equal("Feel better now?", @medic.heals)
  end

end
