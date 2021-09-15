#Autor: smusalane
@Stories
Feature:As a user, I want to enter Google Translator
  To translate words between different languages

  @Scenario1
  Scenario: Translate from English to Spanish
    Given that Yeison wants to use google translate
    When He translates a word from English to Spanish
      |origen  |destino   |palabrai     |
      |inglés  |español   |welcome home |
    Then He should see the word translated from source language to target language
      |palabrae   |
      |mesa       |
