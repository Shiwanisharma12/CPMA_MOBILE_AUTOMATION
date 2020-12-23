package mobile.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import mobile.pages.QA_ActivityPage;
import mobile.pages.TraptypePage;
import mobile.utilities.I;

public class QA_ActivitySteps
{
    TraptypePage traptypePage;
    QA_ActivityPage qa_activityPage;


    @And("^I click on record activity button to select QA activity and then QA activity site$")
    public void iClickOnRecordActivityButtonToSelectQAActivityAndThenQAActivitySite()
    {
        traptypePage.recordActivityBtn();
        qa_activityPage.QAActivity();
        qa_activityPage.QAactivitySite();
    }

    @When("^I select site type$")
    public void iSelectSiteType()
    {
        qa_activityPage.siteType();
    }


    @And("^I fill positive dips value and negative dips values as \"([^\"]*)\" and \"([^\"]*)\" respectively$")
    public void iFillPositiveDipsValueAndNegativeDipsValuesAsAndRespectively(String positive, String negative)
    {
        qa_activityPage.positiveDipsfield(positive);
        qa_activityPage.negativeDipsfield(negative);

    }

    @And("^I fill total acres field as \"([^\"]*)\" and acres breeding as \"([^\"]*)\"$")
    public void iFillTotalAcresFieldAsAndAcresBreedingAs(String totalAcres, String acresBreeding)
    {
        qa_activityPage.totalAcres(totalAcres);
        qa_activityPage.acresBreeding(acresBreeding);
    }

    @And("^I select values of breeding potential ,fish present field,moving water field,evidence of water field$")
    public void iSelectValuesOfBreedingPotentialFishPresentFieldMovingWaterFieldEvidenceOfWaterField()
    {
        qa_activityPage.breedingPotential();
        I.scrollDown();
        qa_activityPage.fishPresent();
        qa_activityPage.movingWater();
        qa_activityPage.evidenceOfwater();
    }

    @And("^I select all the options of mosquito habitat indicators$")
    public void iSelectAllTheOptionsOfMosquitoHabitatIndicators()
    {
        qa_activityPage.mosquitoHabitatindicators();
    }


    @And("^I fill \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" fields$")
    public void iFillFields(String potentialValue1, String value1, String potentialValue2,String value2, String sitePotential)
    {
        qa_activityPage.potentialValue1(potentialValue1);
        qa_activityPage.value1(value1);
        qa_activityPage.potentialValue2(potentialValue2);
        qa_activityPage.value2(value2);
        qa_activityPage.sitePotential(sitePotential);

    }


    @And("^I select values of larvae present field,larvae inside treated area field,larvae outside treated area field,rason larvae present,water present,movement(\\d+),\"([^\"]*)\"field$")
    public void iSelectValuesOfLarvaePresentFieldLarvaeInsideTreatedAreaFieldLarvaeOutsideTreatedAreaFieldRasonLarvaePresentWaterPresentMovementField(int arg0, String movingValue)
    {
        qa_activityPage.larvaePresent();
        qa_activityPage.larvaeInsidetreatedArea();
        I.scrollDown();
        qa_activityPage.larvaeOutsidetreatedArea();
        qa_activityPage.rasonLarvaepresent();
        qa_activityPage.waterPresent();
        qa_activityPage.waterMovement1();
        qa_activityPage.movingField1(movingValue);
        qa_activityPage.waterMovement2();
        qa_activityPage.movingField2(movingValue);
        I.scrollDown();

    }

    @And("^I select all the options of soil conditions,water source and water conditions and select value of how long water present field$")
    public void iSelectAllTheOptionsOfSoilConditionsWaterSourceAndWaterConditionsAndSelectValueOfHowLongWaterPresentField()
    {
        qa_activityPage.soilCondition();
        qa_activityPage.longWaterpresent();
        qa_activityPage.waterSources();
        I.scrollDown();
        qa_activityPage.waterConditions();


    }

    @When("^I select species type larvae count form$")
    public void iSelectSpeciesTypeLarvaeCountForm()
    {
//        I.scrollDown();
//        qa_activityPage.speciesField();

    }


    @And("^I enter \"([^\"]*)\" count in stage one field$")
    public void iEnterCountInStageOneField(String stage1count )
    {
        qa_activityPage.stage1count(stage1count);

    }

    @And("^I enter \"([^\"]*)\" count in stage two field$")
    public void iEnterCountInStageTwoField(String stage2count)
    {
        qa_activityPage.stage2count(stage2count);

    }

    @And("^I enter \"([^\"]*)\" count in stage three field$")
    public void iEnterCountInStageThreeField(String stage3count)
    {
        qa_activityPage.stage3count(stage3count);

    }

    @And("^I enter \"([^\"]*)\" count in stage four field$")
    public void iEnterCountInStageFourField(String stage4count)
    {
        qa_activityPage.stage4count(stage4count);

    }

    @And("^I enter \"([^\"]*)\" count in pupa field$")
    public void iEnterCountInPupaField(String pupa)
    {
        qa_activityPage.pupaField(pupa);
    }

    @And("^I enter \"([^\"]*)\" count in egg field$")
    public void iEnterCountInEggField(String eggCount)
    {
        qa_activityPage.eggField(eggCount);
    }

    @And("^I enter comment of more than (\\d+) characters and verify (\\d+) characters have been accepted in lavae count form$")
    public void iEnterCommentOfMoreThanCharactersAndVerifyCharactersHaveBeenAcceptedInLavaeCountForm(int arg0, int arg1)
    {
        qa_activityPage.commentField();
    }

    @When("^I click on larvae count tab$")
    public void iClickOnLarvaeCountTab()
    {
        I.scrollToElementByTextContains("Submit");
        qa_activityPage.larvaeTab();
    }

    @When("^I click on observation tab$")
    public void iClickOnObservationTab()
    {
        I.scrollToElementByTextContains("Submit");
        qa_activityPage.observationTab();
    }

    @And("^I select product type$")
    public void iSelectProductType()
    {
        qa_activityPage.selectProducttype();
    }

    @And("^I enter \"([^\"]*)\"in quantity floating field$")
    public void iEnterInQuantityFloatingField(String qtyfloating)
    {
        qa_activityPage.quantityFloating(qtyfloating);
    }

    @And("^I enter \"([^\"]*)\"in quantity sunk field$")
    public void iEnterInQuantitySunkField(String qtySunk)
    {
        qa_activityPage.quantitySunk(qtySunk);
    }

    @And("^I enter \"([^\"]*)\"in quantity dry field$")
    public void iEnterInQuantityDryField(String qtyDry)
    {
        qa_activityPage.quantityDry(qtyDry);
    }

    @And("^I enter \"([^\"]*)\"in ground visible field$")
    public void iEnterInGroundVisibleField(String groundvisiblevalue)
    {
        qa_activityPage.groundVisible(groundvisiblevalue);
    }

    @And("^I select larvae field value$")
    public void iSelectLarvaeFieldValue()
    {
        qa_activityPage.larvaefield();
    }

    @And("^I enter \"([^\"]*)\"in percentage coverage field$")
    public void iEnterInPercentageCoverageField(String percentCoverage)
    {
        qa_activityPage.percentCovergaeField(percentCoverage);

    }

    @And("^I enter \"([^\"]*)\" in acres treated field$")
    public void iEnterInAcresTreatedField(String acresTreatedvalue)
    {
        qa_activityPage.acresTreated(acresTreatedvalue);
        I.scrollDown();
    }

    @And("^I enter \"([^\"]*)\" in acres not treated field$")
    public void iEnterInAcresNotTreatedField(String acresNottreatedvalue)
    {
        qa_activityPage.acresNottreated(acresNottreatedvalue);

    }

    @And("^I enter comment of more than (\\d+) characters and verify (\\d+) characters have been accepted in product on=bservation field$")
    public void iEnterCommentOfMoreThanCharactersAndVerifyCharactersHaveBeenAcceptedInProductOnBservationField(int arg0, int arg1)
    {
        qa_activityPage.commentFieldObservationform();
    }

    @And("^I select values of aquatic Organisms,vegetation,source reduction methods,adult activity,activity taken$")
    public void iSelectValuesOfAquaticOrganismsVegetationSourceReductionMethodsAdultActivityActivityTaken()
    {
        qa_activityPage.aquaticOrganisms();
        qa_activityPage.vegetation();
        qa_activityPage.sourceReductionMethods();
        qa_activityPage.adultActivity();
        qa_activityPage.actionTaken();
        qa_activityPage.commentFieldOfQAform();
        qa_activityPage.finishDateQAform();


    }

    @And("^I enter rain gauge value without entering finish date as \"([^\"]*)\"$")
    public void iEnterRainGaugeValueWithoutEnteringFinishDateAs(String value)
    {
        qa_activityPage.rainGaugewithoutFinishdate(value);
    }
}
