# Loyola COMP 271 Lab 7

# Group project

Collaborate with your teammates but submit individually. 
Clearly list the members of your team.

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

- What is the time complexity of each of the four search methods in terms of array or list size n?
- What happens in the case of binary search if the array is not sorted?
- What is the purpose of constructor argument validity checking?
- What is the purpose of using the keyword `final` with variables and arguments?
- What are alternatives to using `Optional` and how do they compare?

# Submission

- Make sure you have created a separate project for this activity.
- Include a project-specific Answers.md file including the responses to the questions above.
- In IDEA, export your project as a zip file and submit as an attachment.

# Grading (SP22 - total 3.5 points)

- 0.3 Main: eliminate this code duplication
- 0.2 Team: constructor with validation
- 0.2 Team: remaining getters
- 0.3 Search: findTeamPosition for List
- 0.3 Search: findTeamMinFunding (linear search)
- 0.3 Search: findTeamMinFundingFast (binary search)
- 0.3 TestTeam: remaining tests
- 0.3 TestSearch: makeListFixture
- 0.3 TestSearch: remaining tests
- 1 Written part
  - 0.7 responses to the questions above
  - 0.2 grammar and style
  - 0.1 formatting

# Grading (total 5 points)

- 0.3 Main: eliminate this code duplication
- 0.3 Team: constructor with validation
- 0.3 Team: remaining getters
- 0.3 Search: findTeamPosition for List
- 0.3 Search: findTeamMinFunding (linear search)
- 0.6 Search: findTeamMinFundingFast (binary search)
- 0.3 TestTeam: remaining tests
- 0.3 TestSearch: makeListFixture
- 0.3 TestSearch: remaining tests
- 1.5 Written part
  - 1.0 responses to the questions above
  - 0.3 grammar and style
  - 0.2 formatting
