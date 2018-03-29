# game.rb
require("pry")

class Game

  attr_reader :player, :hidden_word, :guessed_letters, :found_letters

  def initialize(player, hidden_word)
    @player = player
    @hidden_word = hidden_word
    @guessed_letters = []
    @found_letters = []
    @game_over = false

  end

  def guess(letter)
    unless @guessed_letters.include?(letter)
      @guessed_letters << letter
    end
    if @hidden_word.contains?(letter)
      @found_letters << letter
    else
      @player.lose_life
    end
    # add here to display position of correctly guessed letter
    if @player.lives == 0 || @found_letters.sort == @hidden_word.set_letters.sort.uniq
      @game_over = true
    end
  end

  def game_over?
    return @game_over
  end

end





# game.rb
