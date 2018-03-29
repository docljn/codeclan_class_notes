require('pry-byebug')

class Game

  attr_reader :computer_choice

  def initialize(weapon)
    weapon_options = ['rock', 'paper', 'scissors']
    @weapon = weapon.downcase
    @computer_choice = weapon_options.sample
  end

  def play()
    result = "win"
    return "draw" if @weapon == @computer_choice
    if @weapon == 'rock'
      result = 'lose' unless @computer_choice == 'paper'
    elsif @weapon == 'paper'
      result = 'lose' unless @computer_choice == 'scissors'
    elsif @weapon == 'scissors'
      result = 'lose' unless @computer_choice == 'rock'
    else
      result = 'lose'
    end
    return result
  end




end
