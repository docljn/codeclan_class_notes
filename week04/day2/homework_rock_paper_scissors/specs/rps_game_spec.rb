require('pry-byebug')
require("minitest/autorun")
require ("minitest/reporters")
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative("../models/rps_game.rb")

class GameTest < MiniTest::Test

  def setup()
    @game_rock = Game.new('rock')
    @game_paper = Game.new('paper')
    @game_scissors = Game.new('scissors')

  end

  def test_play_selects_a_weapon()
    @game_rock.play()
    @game_paper.play()
    @game_scissors.play()
    result = @game_rock.play()
    binding.pry
    nil
    assert_equal(result, "draw")

  end

  def test_paper_beats_rock()
    skip
    computer_choice = 'rock'
    result = @game_paper.play()
    assert_equal(result, "paper beats rock")
  end

  def test_scissors_beats_paper()
    skip
  end

  def test_rock_beats_scissors()
    skip
  end



# TEST FUNCTION NAMING
# must start with "test_"

end
