
package com.wheelsup.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "keys",
    "footer",
    "redirects",
    "request-info",
    "header"
})
public class Membership {

    @JsonProperty("keys")
    private Keys keys;
    @JsonProperty("footer")
    private List<Footer> footer = null;
    @JsonProperty("redirects")
    private Redirects redirects;
    @JsonProperty("request-info")
    private RequestInfo requestInfo;
    @JsonProperty("header")
    private List<Header> header = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keys")
    public Keys getKeys() {
        return keys;
    }

    @JsonProperty("keys")
    public void setKeys(Keys keys) {
        this.keys = keys;
    }

    @JsonProperty("footer")
    public List<Footer> getFooter() {
        return footer;
    }

    @JsonProperty("footer")
    public void setFooter(List<Footer> footer) {
        this.footer = footer;
    }

    @JsonProperty("redirects")
    public Redirects getRedirects() {
        return redirects;
    }

    @JsonProperty("redirects")
    public void setRedirects(Redirects redirects) {
        this.redirects = redirects;
    }

    @JsonProperty("request-info")
    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    @JsonProperty("request-info")
    public void setRequestInfo(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    @JsonProperty("header")
    public List<Header> getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(List<Header> header) {
        this.header = header;
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
