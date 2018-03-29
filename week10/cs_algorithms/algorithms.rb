# assume working with sorted arrays only

sorted_array = [1,3,7,8,9,21,23,45,56, 57, 58, 59, 60, 70, 80, 90, 100, 120, 150, 160]


# complexity O(n)
def linear_search(search_number, array)
  for number in array
    return true if number == search_number
  end
  return false
end



# complexity
def binary_search(search_number, array)

  return false if array.empty?
  # halve the length of the array to find the middle element by index
  middle_index = array.length()/2
  middle_element = array[middle_index]
  # is it our element?
  return true if search_number == middle_element

  # split the array into two halves, and choose the one which will contain our item
  new_search_area = search_number < middle_element ? array[0..middle_index - 1] : array[middle_index + 1..array.length() - 1]

  # call the function again until it finds what you are looking for
  return binary_search(search_number, new_search_area)
  # to stop it looping infinitely if the number is not present, check at the start to see if the array is empty, and return false if that is the case

end




# time calc
start_time = Time.now
search = linear_search(7, sorted_array)
end_time = Time.now
duration = (end_time - start_time)*1000000.round(3)
p "Linear search: #{search} in #{duration} micro seconds"



start_time = Time.now
search = binary_search(7, sorted_array)
end_time = Time.now
duration = (end_time - start_time)*1000000.round(3)
p "Binary search: #{search} in #{duration} micro seconds"
