require("minitest/autorun")
require "minitest/reporters"
Minitest::Reporters.use!
# Minitest::Reporters::SpecReporter.new
require_relative( '../friends' )

class TestFriends < MiniTest::Test

  def setup

    @person1 = {
      name: "Rick",
      age: 12,
      monies: 1,
      friends: ["Jay","Keith","Dave", "Val"],
      favourites: {
        tv_show: "Friends",
        things_to_eat: ["charcuterie"]
      }
    }

    @person2 = {
      name: "Jay",
      age: 15,
      monies: 2,
      friends: ["Keith"],
      favourites: {
        tv_show: "Baywatch",
        things_to_eat: ["soup", "bread"]
      }
    }

    @person3 = {
      name: "Val",
      age: 18,
      monies: 20,
      friends: ["Rick", "Jay"],
      favourites: {
        tv_show: "Pokemon",
        things_to_eat: ["ratatouille", "stew"]
      }
    }

    @person4 = {
      name: "Keith",
      age: 18,
      monies: 20,
      friends: ["Rick", "Jay", "Dave"],
      favourites: {
        tv_show: "Pokemon",
        things_to_eat: ["spaghetti"]
      }
    }

    @person5 = {
      name: "Dave",
      age: 20,
      monies: 100,
      friends: [],
      favourites: {
        tv_show: "Scrubs",
        things_to_eat: ["spinach"]
      }
    }



    @people = [@person1, @person2, @person3, @person4, @person5]

  end

  # 1. For a given person, return their name
  def test_getting_name
    result = get_name(@person5)
    assert_equal("Dave", result)
  end

  # 2. For a given person, return their favourite tv show
  # (e.g. for @person2, function should return the string "Baywatch")
  def test_getting_tv_show
    result = get_tv_show(@person5)
    assert_equal('Scrubs', result)
  end

  # 3. For a given person, check if they like a particular food
  # (e.g. function should return true for @person3 when checked for "stew", false for "spinach")

  def test_person4_likes_spaghetti
    result = likes_food?(@person4, "spaghetti")
    expected = true
    assert_equal(expected, result)
  end

  def test_person3_likes_stew
    result = likes_food?(@person3, "stew")
    expected = true
    assert_equal(expected, result)
  end

  def test_person3_doesnt_like_spaghetti
    result = likes_food?(@person3, "spaghetti")
    expected = false
    assert_equal(expected, result)
  end

  # 4. For a given person, add a new name to their list of friends
  # (hint: Add a new string to the friends array, then test for the length
  # of the array, not the return value of your add_friend method)

  def test_adding_friend_to_person4
    # not a robust test, as you could add anything
    add_friend(@person4, "Mike")
    result = @person4[:friends].length
    expected = 4
    assert_equal(expected, result)
  end

  # 5. For a given person, remove a specific name from their list of friends
  # (hint: Same as above, testing for the length of the array
  # should be sufficient)

  def test_correct_person_deleted_from_person3
    result = delete_friend(@person3, "Rick")
    expected = "Rick"
    assert_equal(expected, result)
  end

  def test_deleting_matched_name_from_person3
    delete_friend(@person3, "Jay")
    result = @person3[:friends].length
    expected = 1
    assert_equal(expected, result)
  end

  def test_deleting_mismatched_name_from_person3
    delete_friend(@person3, "Joe")
    result = @person3[:friends].length
    expected = 2
    assert_equal(expected, result)
  end

  def test_deleting_from_person_with_no_friends
    delete_friend(@person5, "Joe")
    result = @person5[:friends].length
    expected = 0
    assert_equal(expected, result)
  end


  # 6. Find the total of everyone's money
  # (hint: use the people array)

  def total_monies
    expected = 143
    result = total_money(@people)
    assert_equal(expected, result)
  end

  # 7. For two given people, allow the first person
  # to loan a given value of money to the other
  # (hint: you need to pass in the lender, the
  # lendee, and the amount for this function)
  # (hint2: You should test if both the lender's
  # and the lendee's money have changed)

  def test_lender_loses_money
    lend_money(@person3, @person1, 5)
    output = @person3[:monies]
    expected = 15
    assert_equal(expected, output)
  end

  def test_recipient_gains_money
    lend_money(@person5, @person4, 5)
    output = @person4[:monies]
    expected = 25
    assert_equal(expected, output)
  end

  def test_lender_money_never_negative
    lend_money(@person2, @person1, 5)
    output = @person2[:monies] >= 0
    expected = true
    assert_equal(expected, output)
  end

  # 8. Find the set of everyone's favourite food joined together
  # (hint: concatenate the favourites/things_to_eat arrays together)

  def test_all_favourite_foods
    result = all_favourite_foods(@people)
    expected = ["charcuterie", "soup", "bread", "ratatouille", "stew", "spaghetti", "spinach"]
    assert_equal(expected, result)
  end


  # 9. Find people with no friends
  # (hint: return an array, there might be more people
  # in the future with no friends!)

  def test_no_friends_collection
    expected = [@person5]
    result = no_friends(@people)
    assert_equal(expected, result)
  end


  # Optional, VERY TOUGH
  # 10. Find the people who have the same favourite tv show



  def test_likes_the_same_tv
    expected = [[@person3, @person4]]
    result = likes_the_same_tv(@people)
    assert_equal(expected, result)
  end






end
