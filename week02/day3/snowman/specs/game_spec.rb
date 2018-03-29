
require("minitest/autorun")
require "minitest/reporters"
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative( '../game.rb' )
require_relative('../player.rb')
require_relative('../hidden_word.rb')


class TestGame < MiniTest::Test

  def setup
    player = Player.new("Selma", 1)
    hidden_word = HiddenWord.new("doll")
    @game = Game.new(player, hidden_word)
  end

  def test_game_has_player
    assert_equal("Selma", @game.player.name)
  end

  def test_game_has_hidden_word
    assert_equal("doll", @game.hidden_word.reveal)
  end

  def test_game_starts_with_game_over_false
    assert_equal(false, @game.game_over?)
  end

  def test_game_starts_with_empty_guessed_letters
    assert_equal([], @game.guessed_letters)
  end

  def test_game_starts_with_empty_found_letters
    assert_equal([], @game.found_letters)
  end


  def test_guessed_letter_is_stored
    @game.guess("z")
    assert_equal(["z"],@game.guessed_letters)
  end

  def test_guessing_letter_twice__stored_once
    @game.guess("z")
    @game.guess("z")
    assert_equal(["z"],@game.guessed_letters)
  end

  def test_player_life_lost_with_wrong_guess__wrong_guess
    # game should ask player to remove a life?
    @game.guess("z")
    assert_equal(0, @game.one-life_player.lives)
  end

  def test_player_life_lost_with_wrong_guess__wrong_guess
    # game should ask player to remove a life?
    @game.guess("z")
    @game.guess("d")
    assert_equal(0, @game.player.lives)
  end

  # def test_guessed_letter_passed_to_hidden_word
  # included in life lost test?
  # end


  # POINTLESS TEST: just reiterating life lost with wrong guess
  # def test_player_has_no_lives
  #   @game.guess("e")
  #   @game.guess("f")
  #   @game.guess("g")
  #   # assert_equal(false, @game.ends?)
  #   @game.guess("h")
  #   @game.guess("j")
  #   @game.guess("k")
  #   @game.guess("a")
  #   assert_equal(true, @game.ends?)
  # end



  def test_once_player_has_no_lives_game_ends
    # I want a 'true' response when a player has no lives left
    @game.guess("f")
    assert_equal(true, @game.game_over?)
  end


  def test_correct_guesses_logged
    @game.guess("d")
    assert_equal(["d"], @game.found_letters)
  end



  def test_once_word_correctly_guessed_game_ends
    @game.guess("d")
    @game.guess("l")
    @game.guess("o")

    assert_equal(true, @game.game_over?)
  end

end
# game_spec.rb


# A `Game` will have properties for a `Player` object, a `HiddenWord` object, and an array of `guessed_letters`

# Extension
# The `Game` should be able to pass a single letter to a `HiddenWord` as a guess
# * It should store these single letters in its `guessed_letters` array
# * It should be able to subtract a life from a `Player` if the guess is incorrect
# * It should be able to tell whether the game `is_won?` or `is_lost?`
