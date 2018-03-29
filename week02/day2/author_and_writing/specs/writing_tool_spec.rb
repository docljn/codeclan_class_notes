# writing_tool_specs.rb
require("minitest/autorun")
require("minitest/rg")
require_relative("../writing_tool")

# No need for author.rb as that class is not used in these tests.

class TestWritingTool < MiniTest::Test

  def setup
    @typewriter = WritingTool.new("Remington", "typewriter")
  end

  def test_tool_has_name
    assert_equal("Remington", @typewriter.name())
  end

end

# end of writing_tool_specs.rb
