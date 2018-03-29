# hidden_word.rb

class HiddenWord

  def initialize(word)
    @word = word
  end

  # Don't have any methods in initialize - messy / confusing

  def set_letters()
    @letters = @word.split("")
  end

  def get_letters_hidden
    set_letters
    @hidden = @letters.map {|letter| letter = "*"}
    return @hidden.join("").to_s
  end

  def contains?(letter)
    return @word.include?(letter)
  end

  # def reveal_word
  #   return @word
  # end

end




# hidden_word.rb
