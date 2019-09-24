
package com.wheelsup.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fleet",
    "financial-analyst",
    "vice-president-of-sales-7",
    "cnbc_12-23_1.html",
    "key-areas-of-safety-assessment",
    "q-a",
    "vice-president-of-sales-6",
    "company/testimonials?1926",
    "company/testimonials?3796",
    "range-and-travel-time",
    "vice-president-of-sales-8",
    "member-services-representative",
    "fleet/king-air-350ifdsfsdfdsf",
    "vice-president-of-sales-5",
    "advantages-over-traditional-charter-brokers",
    "form",
    "quiet-cabin-noise-control",
    "nyt",
    "company/testimonials?1744",
    "company/testimonials",
    "evp-member-experience-and-retention",
    "business-analyst",
    "wheels-down",
    "digital-product-manager",
    "fleet/helicopter",
    "business-analyst-for-salesforce-com",
    "membership",
    "company/our-story",
    "fleet/flight-desk",
    "careers",
    "membership/corporate-membership",
    "why-the-king-air-350i",
    "company/testimonials?1823",
    "benefits-coordinator",
    "manager-talent-acquisition",
    "company/leadership",
    "analyst-advanced-analytics",
    "senior-devops-engineer",
    "company/wheelsup8760",
    "vice-president-of-sales-3",
    "membership/individual-and-family",
    "wsj",
    "range-map",
    "626",
    "why-the-citation-excelxls",
    "fleet/the-wheels-up-citation-excelxls",
    "company/news",
    "vice-president-of-sales-4",
    "ux-ui-design-lead"
})
public class Redirects {

    @JsonProperty("fleet")
    private String fleet;
    @JsonProperty("financial-analyst")
    private String financialAnalyst;
    @JsonProperty("vice-president-of-sales-7")
    private String vicePresidentOfSales7;
    @JsonProperty("cnbc_12-23_1.html")
    private String cnbc12231Html;
    @JsonProperty("key-areas-of-safety-assessment")
    private String keyAreasOfSafetyAssessment;
    @JsonProperty("q-a")
    private String qA;
    @JsonProperty("vice-president-of-sales-6")
    private String vicePresidentOfSales6;
    @JsonProperty("company/testimonials?1926")
    private String companyTestimonials1926;
    @JsonProperty("company/testimonials?3796")
    private String companyTestimonials3796;
    @JsonProperty("range-and-travel-time")
    private String rangeAndTravelTime;
    @JsonProperty("vice-president-of-sales-8")
    private String vicePresidentOfSales8;
    @JsonProperty("member-services-representative")
    private String memberServicesRepresentative;
    @JsonProperty("fleet/king-air-350ifdsfsdfdsf")
    private String fleetKingAir350ifdsfsdfdsf;
    @JsonProperty("vice-president-of-sales-5")
    private String vicePresidentOfSales5;
    @JsonProperty("advantages-over-traditional-charter-brokers")
    private String advantagesOverTraditionalCharterBrokers;
    @JsonProperty("form")
    private String form;
    @JsonProperty("quiet-cabin-noise-control")
    private String quietCabinNoiseControl;
    @JsonProperty("nyt")
    private String nyt;
    @JsonProperty("company/testimonials?1744")
    private String companyTestimonials1744;
    @JsonProperty("company/testimonials")
    private String companyTestimonials;
    @JsonProperty("evp-member-experience-and-retention")
    private String evpMemberExperienceAndRetention;
    @JsonProperty("business-analyst")
    private String businessAnalyst;
    @JsonProperty("wheels-down")
    private String wheelsDown;
    @JsonProperty("digital-product-manager")
    private String digitalProductManager;
    @JsonProperty("fleet/helicopter")
    private String fleetHelicopter;
    @JsonProperty("business-analyst-for-salesforce-com")
    private String businessAnalystForSalesforceCom;
    @JsonProperty("membership")
    private String membership;
    @JsonProperty("company/our-story")
    private String companyOurStory;
    @JsonProperty("fleet/flight-desk")
    private String fleetFlightDesk;
    @JsonProperty("careers")
    private String careers;
    @JsonProperty("membership/corporate-membership")
    private String membershipCorporateMembership;
    @JsonProperty("why-the-king-air-350i")
    private String whyTheKingAir350i;
    @JsonProperty("company/testimonials?1823")
    private String companyTestimonials1823;
    @JsonProperty("benefits-coordinator")
    private String benefitsCoordinator;
    @JsonProperty("manager-talent-acquisition")
    private String managerTalentAcquisition;
    @JsonProperty("company/leadership")
    private String companyLeadership;
    @JsonProperty("analyst-advanced-analytics")
    private String analystAdvancedAnalytics;
    @JsonProperty("senior-devops-engineer")
    private String seniorDevopsEngineer;
    @JsonProperty("company/wheelsup8760")
    private String companyWheelsup8760;
    @JsonProperty("vice-president-of-sales-3")
    private String vicePresidentOfSales3;
    @JsonProperty("membership/individual-and-family")
    private String membershipIndividualAndFamily;
    @JsonProperty("wsj")
    private String wsj;
    @JsonProperty("range-map")
    private String rangeMap;
    @JsonProperty("626")
    private String _626;
    @JsonProperty("why-the-citation-excelxls")
    private String whyTheCitationExcelxls;
    @JsonProperty("fleet/the-wheels-up-citation-excelxls")
    private String fleetTheWheelsUpCitationExcelxls;
    @JsonProperty("company/news")
    private String companyNews;
    @JsonProperty("vice-president-of-sales-4")
    private String vicePresidentOfSales4;
    @JsonProperty("ux-ui-design-lead")
    private String uxUiDesignLead;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fleet")
    public String getFleet() {
        return fleet;
    }

    @JsonProperty("fleet")
    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    @JsonProperty("financial-analyst")
    public String getFinancialAnalyst() {
        return financialAnalyst;
    }

    @JsonProperty("financial-analyst")
    public void setFinancialAnalyst(String financialAnalyst) {
        this.financialAnalyst = financialAnalyst;
    }

    @JsonProperty("vice-president-of-sales-7")
    public String getVicePresidentOfSales7() {
        return vicePresidentOfSales7;
    }

    @JsonProperty("vice-president-of-sales-7")
    public void setVicePresidentOfSales7(String vicePresidentOfSales7) {
        this.vicePresidentOfSales7 = vicePresidentOfSales7;
    }

    @JsonProperty("cnbc_12-23_1.html")
    public String getCnbc12231Html() {
        return cnbc12231Html;
    }

    @JsonProperty("cnbc_12-23_1.html")
    public void setCnbc12231Html(String cnbc12231Html) {
        this.cnbc12231Html = cnbc12231Html;
    }

    @JsonProperty("key-areas-of-safety-assessment")
    public String getKeyAreasOfSafetyAssessment() {
        return keyAreasOfSafetyAssessment;
    }

    @JsonProperty("key-areas-of-safety-assessment")
    public void setKeyAreasOfSafetyAssessment(String keyAreasOfSafetyAssessment) {
        this.keyAreasOfSafetyAssessment = keyAreasOfSafetyAssessment;
    }

    @JsonProperty("q-a")
    public String getQA() {
        return qA;
    }

    @JsonProperty("q-a")
    public void setQA(String qA) {
        this.qA = qA;
    }

    @JsonProperty("vice-president-of-sales-6")
    public String getVicePresidentOfSales6() {
        return vicePresidentOfSales6;
    }

    @JsonProperty("vice-president-of-sales-6")
    public void setVicePresidentOfSales6(String vicePresidentOfSales6) {
        this.vicePresidentOfSales6 = vicePresidentOfSales6;
    }

    @JsonProperty("company/testimonials?1926")
    public String getCompanyTestimonials1926() {
        return companyTestimonials1926;
    }

    @JsonProperty("company/testimonials?1926")
    public void setCompanyTestimonials1926(String companyTestimonials1926) {
        this.companyTestimonials1926 = companyTestimonials1926;
    }

    @JsonProperty("company/testimonials?3796")
    public String getCompanyTestimonials3796() {
        return companyTestimonials3796;
    }

    @JsonProperty("company/testimonials?3796")
    public void setCompanyTestimonials3796(String companyTestimonials3796) {
        this.companyTestimonials3796 = companyTestimonials3796;
    }

    @JsonProperty("range-and-travel-time")
    public String getRangeAndTravelTime() {
        return rangeAndTravelTime;
    }

    @JsonProperty("range-and-travel-time")
    public void setRangeAndTravelTime(String rangeAndTravelTime) {
        this.rangeAndTravelTime = rangeAndTravelTime;
    }

    @JsonProperty("vice-president-of-sales-8")
    public String getVicePresidentOfSales8() {
        return vicePresidentOfSales8;
    }

    @JsonProperty("vice-president-of-sales-8")
    public void setVicePresidentOfSales8(String vicePresidentOfSales8) {
        this.vicePresidentOfSales8 = vicePresidentOfSales8;
    }

    @JsonProperty("member-services-representative")
    public String getMemberServicesRepresentative() {
        return memberServicesRepresentative;
    }

    @JsonProperty("member-services-representative")
    public void setMemberServicesRepresentative(String memberServicesRepresentative) {
        this.memberServicesRepresentative = memberServicesRepresentative;
    }

    @JsonProperty("fleet/king-air-350ifdsfsdfdsf")
    public String getFleetKingAir350ifdsfsdfdsf() {
        return fleetKingAir350ifdsfsdfdsf;
    }

    @JsonProperty("fleet/king-air-350ifdsfsdfdsf")
    public void setFleetKingAir350ifdsfsdfdsf(String fleetKingAir350ifdsfsdfdsf) {
        this.fleetKingAir350ifdsfsdfdsf = fleetKingAir350ifdsfsdfdsf;
    }

    @JsonProperty("vice-president-of-sales-5")
    public String getVicePresidentOfSales5() {
        return vicePresidentOfSales5;
    }

    @JsonProperty("vice-president-of-sales-5")
    public void setVicePresidentOfSales5(String vicePresidentOfSales5) {
        this.vicePresidentOfSales5 = vicePresidentOfSales5;
    }

    @JsonProperty("advantages-over-traditional-charter-brokers")
    public String getAdvantagesOverTraditionalCharterBrokers() {
        return advantagesOverTraditionalCharterBrokers;
    }

    @JsonProperty("advantages-over-traditional-charter-brokers")
    public void setAdvantagesOverTraditionalCharterBrokers(String advantagesOverTraditionalCharterBrokers) {
        this.advantagesOverTraditionalCharterBrokers = advantagesOverTraditionalCharterBrokers;
    }

    @JsonProperty("form")
    public String getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(String form) {
        this.form = form;
    }

    @JsonProperty("quiet-cabin-noise-control")
    public String getQuietCabinNoiseControl() {
        return quietCabinNoiseControl;
    }

    @JsonProperty("quiet-cabin-noise-control")
    public void setQuietCabinNoiseControl(String quietCabinNoiseControl) {
        this.quietCabinNoiseControl = quietCabinNoiseControl;
    }

    @JsonProperty("nyt")
    public String getNyt() {
        return nyt;
    }

    @JsonProperty("nyt")
    public void setNyt(String nyt) {
        this.nyt = nyt;
    }

    @JsonProperty("company/testimonials?1744")
    public String getCompanyTestimonials1744() {
        return companyTestimonials1744;
    }

    @JsonProperty("company/testimonials?1744")
    public void setCompanyTestimonials1744(String companyTestimonials1744) {
        this.companyTestimonials1744 = companyTestimonials1744;
    }

    @JsonProperty("company/testimonials")
    public String getCompanyTestimonials() {
        return companyTestimonials;
    }

    @JsonProperty("company/testimonials")
    public void setCompanyTestimonials(String companyTestimonials) {
        this.companyTestimonials = companyTestimonials;
    }

    @JsonProperty("evp-member-experience-and-retention")
    public String getEvpMemberExperienceAndRetention() {
        return evpMemberExperienceAndRetention;
    }

    @JsonProperty("evp-member-experience-and-retention")
    public void setEvpMemberExperienceAndRetention(String evpMemberExperienceAndRetention) {
        this.evpMemberExperienceAndRetention = evpMemberExperienceAndRetention;
    }

    @JsonProperty("business-analyst")
    public String getBusinessAnalyst() {
        return businessAnalyst;
    }

    @JsonProperty("business-analyst")
    public void setBusinessAnalyst(String businessAnalyst) {
        this.businessAnalyst = businessAnalyst;
    }

    @JsonProperty("wheels-down")
    public String getWheelsDown() {
        return wheelsDown;
    }

    @JsonProperty("wheels-down")
    public void setWheelsDown(String wheelsDown) {
        this.wheelsDown = wheelsDown;
    }

    @JsonProperty("digital-product-manager")
    public String getDigitalProductManager() {
        return digitalProductManager;
    }

    @JsonProperty("digital-product-manager")
    public void setDigitalProductManager(String digitalProductManager) {
        this.digitalProductManager = digitalProductManager;
    }

    @JsonProperty("fleet/helicopter")
    public String getFleetHelicopter() {
        return fleetHelicopter;
    }

    @JsonProperty("fleet/helicopter")
    public void setFleetHelicopter(String fleetHelicopter) {
        this.fleetHelicopter = fleetHelicopter;
    }

    @JsonProperty("business-analyst-for-salesforce-com")
    public String getBusinessAnalystForSalesforceCom() {
        return businessAnalystForSalesforceCom;
    }

    @JsonProperty("business-analyst-for-salesforce-com")
    public void setBusinessAnalystForSalesforceCom(String businessAnalystForSalesforceCom) {
        this.businessAnalystForSalesforceCom = businessAnalystForSalesforceCom;
    }

    @JsonProperty("membership")
    public String getMembership() {
        return membership;
    }

    @JsonProperty("membership")
    public void setMembership(String membership) {
        this.membership = membership;
    }

    @JsonProperty("company/our-story")
    public String getCompanyOurStory() {
        return companyOurStory;
    }

    @JsonProperty("company/our-story")
    public void setCompanyOurStory(String companyOurStory) {
        this.companyOurStory = companyOurStory;
    }

    @JsonProperty("fleet/flight-desk")
    public String getFleetFlightDesk() {
        return fleetFlightDesk;
    }

    @JsonProperty("fleet/flight-desk")
    public void setFleetFlightDesk(String fleetFlightDesk) {
        this.fleetFlightDesk = fleetFlightDesk;
    }

    @JsonProperty("careers")
    public String getCareers() {
        return careers;
    }

    @JsonProperty("careers")
    public void setCareers(String careers) {
        this.careers = careers;
    }

    @JsonProperty("membership/corporate-membership")
    public String getMembershipCorporateMembership() {
        return membershipCorporateMembership;
    }

    @JsonProperty("membership/corporate-membership")
    public void setMembershipCorporateMembership(String membershipCorporateMembership) {
        this.membershipCorporateMembership = membershipCorporateMembership;
    }

    @JsonProperty("why-the-king-air-350i")
    public String getWhyTheKingAir350i() {
        return whyTheKingAir350i;
    }

    @JsonProperty("why-the-king-air-350i")
    public void setWhyTheKingAir350i(String whyTheKingAir350i) {
        this.whyTheKingAir350i = whyTheKingAir350i;
    }

    @JsonProperty("company/testimonials?1823")
    public String getCompanyTestimonials1823() {
        return companyTestimonials1823;
    }

    @JsonProperty("company/testimonials?1823")
    public void setCompanyTestimonials1823(String companyTestimonials1823) {
        this.companyTestimonials1823 = companyTestimonials1823;
    }

    @JsonProperty("benefits-coordinator")
    public String getBenefitsCoordinator() {
        return benefitsCoordinator;
    }

    @JsonProperty("benefits-coordinator")
    public void setBenefitsCoordinator(String benefitsCoordinator) {
        this.benefitsCoordinator = benefitsCoordinator;
    }

    @JsonProperty("manager-talent-acquisition")
    public String getManagerTalentAcquisition() {
        return managerTalentAcquisition;
    }

    @JsonProperty("manager-talent-acquisition")
    public void setManagerTalentAcquisition(String managerTalentAcquisition) {
        this.managerTalentAcquisition = managerTalentAcquisition;
    }

    @JsonProperty("company/leadership")
    public String getCompanyLeadership() {
        return companyLeadership;
    }

    @JsonProperty("company/leadership")
    public void setCompanyLeadership(String companyLeadership) {
        this.companyLeadership = companyLeadership;
    }

    @JsonProperty("analyst-advanced-analytics")
    public String getAnalystAdvancedAnalytics() {
        return analystAdvancedAnalytics;
    }

    @JsonProperty("analyst-advanced-analytics")
    public void setAnalystAdvancedAnalytics(String analystAdvancedAnalytics) {
        this.analystAdvancedAnalytics = analystAdvancedAnalytics;
    }

    @JsonProperty("senior-devops-engineer")
    public String getSeniorDevopsEngineer() {
        return seniorDevopsEngineer;
    }

    @JsonProperty("senior-devops-engineer")
    public void setSeniorDevopsEngineer(String seniorDevopsEngineer) {
        this.seniorDevopsEngineer = seniorDevopsEngineer;
    }

    @JsonProperty("company/wheelsup8760")
    public String getCompanyWheelsup8760() {
        return companyWheelsup8760;
    }

    @JsonProperty("company/wheelsup8760")
    public void setCompanyWheelsup8760(String companyWheelsup8760) {
        this.companyWheelsup8760 = companyWheelsup8760;
    }

    @JsonProperty("vice-president-of-sales-3")
    public String getVicePresidentOfSales3() {
        return vicePresidentOfSales3;
    }

    @JsonProperty("vice-president-of-sales-3")
    public void setVicePresidentOfSales3(String vicePresidentOfSales3) {
        this.vicePresidentOfSales3 = vicePresidentOfSales3;
    }

    @JsonProperty("membership/individual-and-family")
    public String getMembershipIndividualAndFamily() {
        return membershipIndividualAndFamily;
    }

    @JsonProperty("membership/individual-and-family")
    public void setMembershipIndividualAndFamily(String membershipIndividualAndFamily) {
        this.membershipIndividualAndFamily = membershipIndividualAndFamily;
    }

    @JsonProperty("wsj")
    public String getWsj() {
        return wsj;
    }

    @JsonProperty("wsj")
    public void setWsj(String wsj) {
        this.wsj = wsj;
    }

    @JsonProperty("range-map")
    public String getRangeMap() {
        return rangeMap;
    }

    @JsonProperty("range-map")
    public void setRangeMap(String rangeMap) {
        this.rangeMap = rangeMap;
    }

    @JsonProperty("626")
    public String get626() {
        return _626;
    }

    @JsonProperty("626")
    public void set626(String _626) {
        this._626 = _626;
    }

    @JsonProperty("why-the-citation-excelxls")
    public String getWhyTheCitationExcelxls() {
        return whyTheCitationExcelxls;
    }

    @JsonProperty("why-the-citation-excelxls")
    public void setWhyTheCitationExcelxls(String whyTheCitationExcelxls) {
        this.whyTheCitationExcelxls = whyTheCitationExcelxls;
    }

    @JsonProperty("fleet/the-wheels-up-citation-excelxls")
    public String getFleetTheWheelsUpCitationExcelxls() {
        return fleetTheWheelsUpCitationExcelxls;
    }

    @JsonProperty("fleet/the-wheels-up-citation-excelxls")
    public void setFleetTheWheelsUpCitationExcelxls(String fleetTheWheelsUpCitationExcelxls) {
        this.fleetTheWheelsUpCitationExcelxls = fleetTheWheelsUpCitationExcelxls;
    }

    @JsonProperty("company/news")
    public String getCompanyNews() {
        return companyNews;
    }

    @JsonProperty("company/news")
    public void setCompanyNews(String companyNews) {
        this.companyNews = companyNews;
    }

    @JsonProperty("vice-president-of-sales-4")
    public String getVicePresidentOfSales4() {
        return vicePresidentOfSales4;
    }

    @JsonProperty("vice-president-of-sales-4")
    public void setVicePresidentOfSales4(String vicePresidentOfSales4) {
        this.vicePresidentOfSales4 = vicePresidentOfSales4;
    }

    @JsonProperty("ux-ui-design-lead")
    public String getUxUiDesignLead() {
        return uxUiDesignLead;
    }

    @JsonProperty("ux-ui-design-lead")
    public void setUxUiDesignLead(String uxUiDesignLead) {
        this.uxUiDesignLead = uxUiDesignLead;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
