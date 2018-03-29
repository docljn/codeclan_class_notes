def get_name(person)
  return person[:name]
end

def get_tv_show(person)
  return person[:favourites][:tv_show]
end

def likes_food?(person, food)
  likes = person[:favourites][:things_to_eat]
  return likes.include?(food)
end

def add_friend(person, name)
  person[:friends].push(name)
  return person
end

def delete_friend(person, name)
  person[:friends].delete(name)
end

def total_monies(people)
  total_money = 0
  for person in people
    total_money += person[:monies]
  end
  return total_money
end

def lend_money(lender, recipient, amount)
  if lender[:monies] - amount >= 0
    lender[:monies] -= amount
    recipient[:monies] += amount
  end
  # WHAT SHOULD I RETURN?
end

def all_favourite_foods(array_of_people)
  foods = []
  for person in array_of_people
    foods += person[:favourites][:things_to_eat]
  end
  return foods
end

def no_friends(array_of_people)
  loners = []
  for person in @people
    if person[:friends]==[]
      loners << person
    end
  end
  return loners
end

# This works if there are only two people with a show in common

# def likes_the_same_tv(array_of_people)
#   like_same_tv = []
#   counter = 0
#   while counter < array_of_people.length
#     reference_person = array_of_people[counter]
#     for person in array_of_people
#       show_choice = reference_person[:favourites][:tv_show]
#
#       if show_choice == person[:favourites][:tv_show] && person != reference_person
#
#         # maybe use .select here instead of the loop?
#
#         like_same_tv.push(reference_person, person)
#       end
#     end
#     counter +=1
#   end
#   like_same_tv.uniq! #removes duplicates from the array
# return like_same_tv
# end

# still doesn't quite work....
def likes_the_same_tv(array_of_people)
  tv_shows = []
  show_match = []
  liked_show = person[:favourites][:tv_show]

  for person in array_of_people
    tv_shows << liked_show
  end

  counter = 0
  while counter < tv_shows.length
      for person in array_of_people
        show_match[counter] = []
        if liked_show.include? show
          show_match[counter] << person
        end
      end
    counter +=1
  end

  return show_match
end
