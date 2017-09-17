# COMP 271 002 F17 Lab 2

# Team project

Work in teams of two but submit individually (see details below)

# Objectives

An understanding of the following concepts and techniques:

- entity objects
- linear search
- binary search
- algorithmic complexity
- arrays versus lists
- [optional values](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)
- DRY and factoring out methods
- final-correctness
- automated unit testing using JUnit
- testing for exceptions
- test fixtures and assertions

# Instructions

1. Review the code.
2. Run the code for various inputs to gain an understanding of what it does.
3. Complete the items marked TODO in the code and get the tests to pass.
4. Create a markdown document called Answers.md and answer the questions in the next section.

# Questions

- What is the complexity of each of the four search methods in terms of array or list size n?
- What happens in the case of binary search if the array is not sorted?
- What is the purpose of constructor argument validity checking?
- What is the purpose of using the keyword `final` with variables and arguments?
- What are alternatives to using `Optional` and how do they compare?

# Deliverables and submission

Please submit the following deliverables individually:

- Individual GitHub Classroom lab2 repository 
- Individual Sakai submission under "Lab 2":
  - URL of GitHub team repository
  - Brief description of your collaboration style and summary of your 
    individual contributions to this team project

# Grading

- 0.5 Main: eliminate this code duplication
- 0.5 Team: constructor with validation
- 0.5 Team: remaining getters
- 0.5 Search: findTeamPosition for List
- 0.5 Search: findTeamMinFunding (linear search)
- 1.0 Search: findTeamMinFundingFast (binary search)
- 0.5 TestTeam: remaining tests
- 0.5 TestSearch: makeListFixture
- 1.0 TestSearch: remaining tests
- 1.0 correct Gradle-based project structure
- 1.0 correct use of Git version control
- 2.5 Written part
  - 1.5 responses to the questions above
  - 0.5 grammar and style
  - 0.5 formatting

*10 points TOTAL*