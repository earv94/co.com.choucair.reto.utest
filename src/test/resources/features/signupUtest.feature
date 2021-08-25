#language:en
#Autor: Efrain Rojas

@stories
Feature: Academy Choucair
  As a user, I want to sign up at the Utest page to find a tester job
  @scenario1
  Scenario: Sign in
    Given than brandom wants to signup at the Utest page
    When he fill out the registration form on the Utest web page
      | strFirstName | strLastName  | strEmail           | strBirthMonth | strBirthDay | strBirthYear | strlanguage | strCity | strZip | strDevice | strModel | strOS       | strPassword   | strConfirmPass |
      | Efrain       | Rojas        | prueba21@gmail.com | May           | 11          | 1994         | Spanish     | Bogota  | 111311 | Xiaomi    | Redmi 3  | Android 5.1 | Choucair*2021 | Choucair*2021  |
    Then he should see the confirmation page at the Utest web page
      | strText                                                                 |
      | Welcome to the world's largest community of freelance software testers! |