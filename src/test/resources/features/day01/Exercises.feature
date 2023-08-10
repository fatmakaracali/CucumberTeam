Feature: US01 Amazonda Urun Arama Testi

  Scenario: TC01 Amazonda Iphone Arama

    Given kullanici amazon sayfasina gider
    But kullanici 2 saniye bekler
    Then kullanici arama kutusunda iphone aratir
    But kullanici 2 saniye bekler
    And sayfayi kapatir