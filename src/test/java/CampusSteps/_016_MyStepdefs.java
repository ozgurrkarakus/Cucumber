package CampusSteps;

import PROJECT.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _016_MyStepdefs extends BaseDriver {
    @Given("ogrenci ana sayfada")
    public void ogrenciAnaSayfada() {
        System.out.println("Site açıldı");
        LoginTestMersys();    }

    @When("ogrenci Grading linkine tiklar")
    public void ogrenciGradingLinkineTiklar() {

    }

    @Then("ogrenci degerlendirme sayfasina yonlendirilir")
    public void ogrenciDegerlendirmeSayfasinaYonlendirilir() {
    }

    @Given("ogrenci degerlendirme sayfasinda")
    public void ogrenciDegerlendirmeSayfasinda() {
    }

    @When("ogrenci Course Grade butonuna tiklar")
    public void ogrenciCourseGradeButonunaTiklar() {
    }

    @Then("ogrenci ders notlari sayfasini gorur")
    public void ogrenciDersNotlariSayfasiniGorur() {
    }

    @When("ogrenci Student Transcrip butonuna tiklar")
    public void ogrenciStudentTranscripButonunaTiklar() {
    }

    @Then("ogrenci ogrenci transkripti sayfasini gorur")
    public void ogrenciOgrenciTranskriptiSayfasiniGorur() {
    }

    @When("ogrenci Transcript By Subject butonuna tiklar")
    public void ogrenciTranscriptBySubjectButonunaTiklar() {
    }

    @Then("ogrenci kursa gore transkript sayfasini gorur")
    public void ogrenciKursaGoreTranskriptSayfasiniGorur() {
    }
}
