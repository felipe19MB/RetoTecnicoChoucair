Feature: Perform Crud methods for the dummy api

  @probarAPI
  Scenario Outline: Perform a query, create, update, and delete process
  of employees

    Given Consult employee information
    And Update employee information "<name>", "<salary>", "<age>"
    When delete employee information
    And Create New Employee "<name>", "<salary>", "<age>"
    And Consult every employee information

    Examples:
      | name   | salary   | age |
      | Jose | 10000000 | 23  |
