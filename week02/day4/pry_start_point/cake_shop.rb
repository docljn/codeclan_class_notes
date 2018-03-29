require("pry")

class CakeShop

  attr_reader :cakes

  def initialize(cakes)
    @cakes = cakes
  end

  def average_cake_rating()

    # @cakes.map { |cake| cake.rating }
    ratings = @cakes.map { |cake| cake.rating }
    ratings_sum = 0

    # for rating in @cakes
    for rating in ratings
      binding.pry
      ratings_sum += rating
      binding.pry
    end

    average = ratings_sum / ratings.length

    return average

  end

end
