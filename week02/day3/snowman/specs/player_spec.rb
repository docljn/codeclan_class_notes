require("minitest/autorun")
require "minitest/reporters"
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative( '../player.rb')


class TestPlayer < MiniTest::Test

  def setup
    @player = Player.new("Sara", 6)
  end

  def test_player_has_name
    assert_equal("Sara", @player.name)
  end

  def test_player_starts_with_six_lives
    assert_equal(6, @player.lives)
  end

  def test_player_can_lose_life
    @player.lose_life
    assert_equal(5, @player.lives)
  end




end

# A `Player` will have a `name` and number of `lives`
