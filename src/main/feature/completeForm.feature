
Feature: Entrar no site
  Scenario: Entrar no sampleApp
    Given que entrei no site: "http://sampleapp.tricentis.com/101/app.php"
    Then Preencher a primeira pagina
    Then Preencher a segunda pagina
    Then Preencher a terceira pagina
    Then Preencher a quarta pagina
    Then Preencher a quinta pagina