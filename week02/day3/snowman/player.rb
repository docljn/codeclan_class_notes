# player.rb

class Player

  attr_reader :name, :lives

  def initialize(name, lives)
    @name = name
    @lives = lives
  end

  def lose_life()
    @lives -=1
    if @lives < 0
      @lives = 0
    end
  end



end






# player.rb
