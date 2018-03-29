# enumerable.rb

# CARE:
# use {} for a single line block
# use do end for a multi-line block

chickens = [
  "Margaret",
  "Hetty",
  "Mabel",
  "Craig",
  "Max"
]



# each_with_index

chickens.each_with_index do |bird, index|
  p "#{bird} is at index #{index}"

end



# find
# returns the first item where the block evaluates to true
# if item is an object, you get the object back
# returns 'nil' if none found
# # use .any? to get true/false if item is found/not

found_chicken = chickens.find {|bird| bird[0] == "H"}

chosen_chicken = chickens.find do |bird|
  bird.length == 5
end

p found_chicken # Hetty
p chosen_chicken # Hetty i.e. it only finds the first one



# find_all, select
# returns ALL instances where block evaluates to true

all_five_letter_names = chickens.find_all {|bird| bird.length == 5}

p all_five_letter_names

# inject, reduce
# block takes accumulator, variable
# accumulator starts as first item in array
# variable starts as second item in array

string = chickens.reduce  do |accumulator, bird|
  accumulator + ", " + bird
end
p string

numbers = [1, 2, 3, 4, 5, 6, 7, 8]
# I want to add all the numbers together
sum = numbers.reduce do |running_total, current_number|
  running_total + current_number
end
p sum
# using a 'for' loop this is much more complex:
total = 0
for number in numbers
  total += number
end
p total

numbers = (0..100).to_a
sum = numbers.reduce do |running_total, current_number|
  running_total + current_number
end
p sum
