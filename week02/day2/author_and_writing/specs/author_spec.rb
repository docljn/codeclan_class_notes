# author_spec.rb
require("minitest/autorun")
require("minitest/rg")

# CARE: need to add all class files if multi-class setup
#
require_relative("../author")
require_relative("../writing_tool")

class TestAuthor < MiniTest::Test

  # SINGLE CLASS SETUP
  # def setup
  #   @author = Author.new("Neil Gaiman", "MacBook Pro", "laptop")
  #   @author2 = Author.new("E.A. Poe", "Remington DeLuxe 5", "typewriter")
  # end

  # MULTI CLASS SETUP
  def setup
    # can't create this in the writing tool spec file, as the test files can't see each other!
    @laptop = WritingTool.new("MacBook Pro", "laptop")
    @typewriter = WritingTool.new("Remington", "typewriter")
    @author = Author.new("Neil Gaiman", @laptop)
    @author2 = Author.new("E.A. Poe", @typewriter)
  end


  # NO CHANGE TO THE TESTS WHEN EXTRACTING INTO MULTIPLE CLASSES

  # start with a getter test to check that your setup is working
  def test_author_has_name
    assert_equal("Neil Gaiman", @author.name())
  end

  def test_author_can_write
    assert_equal("American Gods", @author.write("American Gods"))
  end

  def test_author_can_write_with_typewriter
    result = @author2.write("The Raven")
    assert_equal("The Raven, with old school click clacking.", result)
  end




end
# end of author_spec.rb
