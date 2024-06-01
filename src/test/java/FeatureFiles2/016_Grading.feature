Feature: Ogrenci Degerlendirme Sayfasi

  Scenario: Ana sayfadan degerlendirme sayfasina erisim
    Given ogrenci ana sayfada
    When ogrenci Grading linkine tiklar
    Then ogrenci degerlendirme sayfasina yonlendirilir

  Scenario: Degerlendirme sayfasindaki butonlarin calismasi
    Given ogrenci degerlendirme sayfasinda
    When ogrenci Course Grade butonuna tiklar
    Then ogrenci ders notlari sayfasini gorur
    When ogrenci Student Transcrip butonuna tiklar
    Then ogrenci ogrenci transkripti sayfasini gorur
    When ogrenci Transcript By Subject butonuna tiklar
    Then ogrenci kursa gore transkript sayfasini gorur
