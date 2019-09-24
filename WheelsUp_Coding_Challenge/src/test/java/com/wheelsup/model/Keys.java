
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
    "google_places",
    "mapbox_flight_estimator_style",
    "marketo_form_account",
    "marketo_form_id",
    "google_plus",
    "google_tag_manager",
    "twitter",
    "footer_disclaimer",
    "instagram",
    "mapbox_accesstoken",
    "mapbox_style",
    "email",
    "password",
    "facebook"
})
public class Keys {

    @JsonProperty("google_places")
    private String googlePlaces;
    @JsonProperty("mapbox_flight_estimator_style")
    private String mapboxFlightEstimatorStyle;
    @JsonProperty("marketo_form_account")
    private String marketoFormAccount;
    @JsonProperty("marketo_form_id")
    private String marketoFormId;
    @JsonProperty("google_plus")
    private String googlePlus;
    @JsonProperty("google_tag_manager")
    private String googleTagManager;
    @JsonProperty("twitter")
    private String twitter;
    @JsonProperty("footer_disclaimer")
    private String footerDisclaimer;
    @JsonProperty("instagram")
    private String instagram;
    @JsonProperty("mapbox_accesstoken")
    private String mapboxAccesstoken;
    @JsonProperty("mapbox_style")
    private String mapboxStyle;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @JsonProperty("facebook")
    private String facebook;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("google_places")
    public String getGooglePlaces() {
        return googlePlaces;
    }

    @JsonProperty("google_places")
    public void setGooglePlaces(String googlePlaces) {
        this.googlePlaces = googlePlaces;
    }

    @JsonProperty("mapbox_flight_estimator_style")
    public String getMapboxFlightEstimatorStyle() {
        return mapboxFlightEstimatorStyle;
    }

    @JsonProperty("mapbox_flight_estimator_style")
    public void setMapboxFlightEstimatorStyle(String mapboxFlightEstimatorStyle) {
        this.mapboxFlightEstimatorStyle = mapboxFlightEstimatorStyle;
    }

    @JsonProperty("marketo_form_account")
    public String getMarketoFormAccount() {
        return marketoFormAccount;
    }

    @JsonProperty("marketo_form_account")
    public void setMarketoFormAccount(String marketoFormAccount) {
        this.marketoFormAccount = marketoFormAccount;
    }

    @JsonProperty("marketo_form_id")
    public String getMarketoFormId() {
        return marketoFormId;
    }

    @JsonProperty("marketo_form_id")
    public void setMarketoFormId(String marketoFormId) {
        this.marketoFormId = marketoFormId;
    }

    @JsonProperty("google_plus")
    public String getGooglePlus() {
        return googlePlus;
    }

    @JsonProperty("google_plus")
    public void setGooglePlus(String googlePlus) {
        this.googlePlus = googlePlus;
    }

    @JsonProperty("google_tag_manager")
    public String getGoogleTagManager() {
        return googleTagManager;
    }

    @JsonProperty("google_tag_manager")
    public void setGoogleTagManager(String googleTagManager) {
        this.googleTagManager = googleTagManager;
    }

    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    @JsonProperty("twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @JsonProperty("footer_disclaimer")
    public String getFooterDisclaimer() {
        return footerDisclaimer;
    }

    @JsonProperty("footer_disclaimer")
    public void setFooterDisclaimer(String footerDisclaimer) {
        this.footerDisclaimer = footerDisclaimer;
    }

    @JsonProperty("instagram")
    public String getInstagram() {
        return instagram;
    }

    @JsonProperty("instagram")
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    @JsonProperty("mapbox_accesstoken")
    public String getMapboxAccesstoken() {
        return mapboxAccesstoken;
    }

    @JsonProperty("mapbox_accesstoken")
    public void setMapboxAccesstoken(String mapboxAccesstoken) {
        this.mapboxAccesstoken = mapboxAccesstoken;
    }

    @JsonProperty("mapbox_style")
    public String getMapboxStyle() {
        return mapboxStyle;
    }

    @JsonProperty("mapbox_style")
    public void setMapboxStyle(String mapboxStyle) {
        this.mapboxStyle = mapboxStyle;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("facebook")
    public String getFacebook() {
        return facebook;
    }

    @JsonProperty("facebook")
    public void setFacebook(String facebook) {
        this.facebook = facebook;
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
