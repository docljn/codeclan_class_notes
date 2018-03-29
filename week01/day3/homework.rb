# homework.rb

# A. Given the following data structure:
stops = [ "Croy", "Cumbernauld", "Falkirk High", "Linlithgow", "Livingston", "Haymarket" ]

# 1. Add `"Edinburgh Waverley"` to the end of the array
stops << "Edinburgh Waverley"
# p stops

# 2. Add `"Glasgow Queen St"` to the start of the array
stops.unshift("Glasgow Queen St")
# p stops


# 3. Add `"Polmont"` at the appropriate point (between `"Falkirk High"` and `"Linlithgow"`)

# # insert(index, obj...) → ary
# # Inserts the given values before the element with the given index.
stops.insert(stops.index("Linlithgow"), "Polmont")
# p stops

# 4. Work out the index position of `"Linlithgow"`
# index searches the array for the object starting at element 0 and working up, where rindex will start at the end of the array and work down searching for the object. They can both return the same result if the object you're searching for only exists in the array once. But if, however, it exists multiple times you'll get different indices when using index as it only returns the index first occurrence of the object you're searching for.
index_number = stops.index("Linlithgow")
# p index_number

# 5. Remove `"Livingston"` from the array using its name
stops.delete("Livingston") # returns the deleted item
# p stops

# 6. Delete `"Cumbernauld"` from the array by index
to_delete = stops.index("Cumbernauld")
stops.delete_at(to_delete)
# also .slice!
# p stops

# # 7. How many stops there are in the array?
# p stops.length
# p stops.count
# p stops.size

#
# # 8. How many ways can we return `"Falkirk High"` from the array?
# puts "1"
# p stops.slice(2)
# puts "2"
# result = stops.select { |stop| stop == "Falkirk High"}
# p result[0]
# puts "3"
# p stops[2]
# puts "4"
# p stops[-5]
# puts "5"
# p stops.fetch(2)
# puts "6"
# stops.at(2)

# # 9. Reverse the positions of the stops in the array
# p stops.reverse!
# # OR you could pop off the end and push that into a new array, and repeat?
# stops_reversed = []
# while stops.length > 0
#   halt = stops.pop
#   stops_reversed << halt
# end
# stops = stops_reversed
# p stops
# # get back to the reversed array
# stops.reverse!
#
# # 10. Print out all the stops using a for loop
# for halt in stops
#   p halt
# end
#
#
# ## B. Given the following data structure:
#
  users = {
    "Jonathan" => {
      :twitter => "jonnyt",
      :favourite_numbers => [12, 42, 75, 12, 5],
      :home_town => "Stirling",
      :pets => {
        "fluffy" => :cat,
        "fido" => :dog,
        "spike" => :dog
      }
    },
    "Erik" => {
      :twitter => "eriksf",
      :favourite_numbers => [8, 12, 24],
      :home_town => "Linlithgow",
      :pets => {
        "nemo" => :fish,
        "kevin" => :fish,
        "spike" => :dog,
        "rupert" => :parrot
      }
    },
    "Avril" => {
      :twitter => "bridgpally",
      :favourite_numbers => [12, 14, 85, 88],
      :home_town => "Dunbar",
      :pets => {
        "colin" => :snake
      }
    },
  }

# # 1. Get Jonathan's Twitter handle (i.e. the string `"jonnyt"`)
# p users["Jonathan"][:twitter]
#
# # 2. Get Erik's hometown
# p users["Erik"][:home_town]
#
# # 3. Get the array of Erik's favourite numbers
# eriks_numbers = users["Erik"][:favourite_numbers]
# p eriks_numbers
#
# # 4. Get the type of Avril's pet Colin
# avrils_pet = users["Avril"][:pets]["colin"]
# p avrils_pet
#
# # 5. Get the smallest of Erik's favourite numbers
# smallest = eriks_numbers.sort![0]
# p smallest
# p users["Erik"][:favourite_numbers].min()
#
# # 6. Add the number `7` to Erik's favourite numbers
# eriks_numbers << 7
# p eriks_numbers
#
# # 7. Change Erik's hometown to Edinburgh
# eriks_hometown = users["Erik"][:hometown]
# eriks_hometown = "Edinburgh"
# p eriks_hometown
#
# # 8. Add a pet dog to Erik called "Fluffy"
# eriks_pets = users["Erik"][:pets]
# p eriks_pets
# eriks_pets["Fluffy"] = :dog
# p eriks_pets
#
# # 9. Add yourself to the users hash
#
# lorna = {
#   :twitter => "drljnoble",
#   :favourite_numbers => [19, 23, 7],
#   :home_town => "Edinburgh",
#   :pets => {
#     "john" => :husband
#   }
# }
#
# users["Lorna"] = lorna
# p users
#
# # C. Given the following data structure:
#
#
united_kingdom = [
  {
    name: "Scotland",
    population: 5295000,
    capital: "Edinburgh"
  }, {
    name: "Wales",
    population: 3063000,
    capital: "Swansea"
  }, {
    name: "England",
    population: 53010000,
    capital: "London"
  }
]

#
#
# # 1. Change the capital of Wales from `"Swansea"` to `"Cardiff"`.
united_kingdom[1][:capital] = "Cardiff"
# p united_kingdom[1]
#
# # 2. Create a Hash for Northern Ireland and add it to the `united_kingdom` array (The capital is Belfast, and the population is 1,811,000).
northern_ireland = {
  name: "Northern Ireland",
  population: 1811000,
  capital: "Belfast"
}
united_kingdom << northern_ireland
# p united_kingdom
#
# # 3. Use a loop to print the names of all the countries in the UK.
# united_kingdom.each do |country|
#   p country[:name]
# end
# # OR
# for country in united_kingdom
#   p country[:name]
# end
#
# # 4. Use a loop to find the total population of the UK.
# total_population = 0
# for country in united_kingdom
#   total_population += country[:population]
# end
# p total_population
#
# # confirming the amount:
# calc = 5295000 + 3063000 + 53010000 + 1811000
# p calc
