
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
    "cta_url",
    "cta_text"
})
public class RequestInfo {

    @JsonProperty("cta_url")
    private String ctaUrl;
    @JsonProperty("cta_text")
    private String ctaText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cta_url")
    public String getCtaUrl() {
        return ctaUrl;
    }

    @JsonProperty("cta_url")
    public void setCtaUrl(String ctaUrl) {
        this.ctaUrl = ctaUrl;
    }

    @JsonProperty("cta_text")
    public String getCtaText() {
        return ctaText;
    }

    @JsonProperty("cta_text")
    public void setCtaText(String ctaText) {
        this.ctaText = ctaText;
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
