require("minitest/autorun")
require "minitest/reporters"
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative("../agent.rb")

class TestAgent < Minitest::Test

  def setup
    @agent = Agent.new("James", "Bond")
  end

  # def test_agent_has_names
  #   assert_equal("James", @agent.first_name)
  #   assert_equal("Bond", @agent.last_name)
  # end

  def test_agent_talks
    assert_equal("The name's Bond, James Bond.", @agent.talks)
  end


end
