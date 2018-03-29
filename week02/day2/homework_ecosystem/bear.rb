class Bear

  attr_reader :name

  def initialize(name)
    @name = name
    @stomach = []
  end


  def fish_count
    return @stomach.length
  end

  def eat_fish(river)
    taken = river.sample_contents
    river.remove_fish(taken)
    @stomach.push(taken) if !taken.nil? # i.e. river was not empty
    if taken.name == "puffer"
      @stomach.clear()
      growls("I feel so sick")
    end
  end

  # refactoring eat_fish?
  # 1.  Bear tells river to remove a fish from its fish stock.
  # instead of river.contents.delete(taken)
  # river.remove_fish(taken)
  # add method to river instead of bear....

  # 2. Bear tells river to provide a random fish to catch.
  # instead of taken = river.contents.sample
  # taken = river.sample_contents

  # 3. add if !taken.nil? check to add fish to stomach

  def growls(words)
    return "GRRRR! #{words.upcase}! GRRRR!"
  end



end
