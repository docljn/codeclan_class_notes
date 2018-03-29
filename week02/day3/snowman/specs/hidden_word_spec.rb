
require("minitest/autorun")
require "minitest/reporters"
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative( '../hidden_word.rb')


class TestHiddenWord < MiniTest::Test

  def setup
    @hidden_word = HiddenWord.new("hello")
  end

  def test_word_can_be_hidden
    assert_equal("*****", @hidden_word.get_letters_hidden)
  end

  def test_hidden_word_confirms_letter__present
    assert_equal(true, @hidden_word.contains?("l"))
  end

  def test_hidden_word_confirms_letter__absent
    assert_equal(false, @hidden_word.contains?("m"))
  end




end

# A `HiddenWord` will be initialised with a `word` string, but will only `display` letters which have been correctly guessed, replacing the rest with the `*` character
# * The `HiddenWord` should also be able to report `true` or `false` if a letter appears in the `word`
