pets = [
  {
    name: "Sir Percy",
    pet_type: :cat,
    breed: "British Shorthair",
    price: 500
  },
  {
    name: "King Bagdemagus",
    pet_type: :cat,
    breed: "British Shorthair",
    price: 500
  },
  {
    name: "Sir Lancelot",
    pet_type: :dog,
    breed: "Pomsky",
    price: 1000,
  },
  {
    name: "Arthur",
    pet_type: :dog,
    breed: "Husky",
    price: 900,
  },
  {
    name: "Merlin",
    pet_type: :cat,
    breed: "Egyptian Mau",
    price: 1500,
  },
  {
    name: "Tristan",
    pet_type: :dog,
    breed: "Basset Hound",
    price: 800,
  }
]

# # Examples:
#
# ## Print out all of the names using a loop
# for pet in pets
#   p pet[:name]
# end
#
# ## Print out all of the names using an Enumerable method
# pets.each { |pet| p pet[:name] }
#
# ## Find a pet by name using a loop and if statement
# result = nil
#
# for pet in pets
#   if pet[:name] == "Tristan"
#     result = pet
#   end
# end
#
# p result
#
# ## Find a pet using an Enumerable method
# enums_result = pets.find { |pet| pet[:name] == "Tristan" }
#
# p enums_result


# Tasks:
## Using enumerable methods:

## Find the pet which is a Husky
dog = pets.find {|pet| pet[:breed] == "Husky" }
p dog

## Make an array of all of the pets' names

pet_names = pets.map {|pet| pet[:name]}
p pet_names

## Find out if there are any pets of breed 'Dalmation' (true or false)

spotty_dogs = pets.any? {|pet| pet[:breed] == "Dalmation"}
p spotty_dogs

## Find the most expensive pet i.e. pet with the highest/maximum price
p ""
p "most expensive pet"
expensive_pet = pets.max {|pet1, pet2| pet1[:price] <=> pet2[:price]}
p expensive_pet

## Find the total value (price) of all of the pets added together.
prices = pets.map {|pet| pet[:price]}
p prices
p prices.sum # new method!!

stock_value = prices.reduce {|acc, price| acc + price}
p stock_value

# one line total price solution
puts pets.reduce(0) {|total, pet| total + pet[:price]}


## Change each pet so their price is 50% cheaper
p "original price"
puts pets

sale = pets.map do |pet|
  {
    name: pet[:name],
    pet_type: pet[:pet_type],
    breed: pet[:breed],
    price: pet[:price]/2
  }
end
p "sale price"
puts sale
