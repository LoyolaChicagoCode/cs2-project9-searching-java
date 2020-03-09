# Loyola COMP 271 Lab 7

# Pair project

Collaborate with your teammates but submit individually. Clearly list the members of your team.

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

- Individual GitHub lab7 repository 
- Individual Sakai submission under "Lab 7":
  - URL of your GitHub repository
  - Very brief description of your collaboration style and summary of your 
    individual contributions to this project

# Grading

- 0.3 Main: eliminate this code duplication
- 0.3 Team: constructor with validation
- 0.3 Team: remaining getters
- 0.3 Search: findTeamPosition for List
- 0.3 Search: findTeamMinFunding (linear search)
- 0.5 Search: findTeamMinFundingFast (binary search)
- 0.3 TestTeam: remaining tests
- 0.3 TestSearch: makeListFixture
- 0.3 TestSearch: remaining tests
- 0.3 correct Maven-based project structure
- 0.3 correct use of Git version control
- 1.5 Written part
  - 1.0 responses to the questions above
  - 0.3 grammar and style
  - 0.2 formatting

*5 points TOTAL*
