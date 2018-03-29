class Student

  def initialize(student_name, cohort_number)
    @student_name = student_name
    @cohort_number = cohort_number.to_i()  # ensures data type entered doesn't cause problems
  end

  def name()
    return @student_name
  end

  def cohort()
    return @cohort_number
  end

  def name=(new_name)
    @student_name = new_name
  end

  def cohort_number=(new_cohort_number)
    @cohort_number = new_cohort_number
  end

  def speaks()
    return "I can talk"
  end

  def say_favourite_language(language)
    return "I love #{language}"

  end

end
