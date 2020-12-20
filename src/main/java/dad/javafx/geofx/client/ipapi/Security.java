
package dad.javafx.geofx.client.ipapi;

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
    "is_proxy",
    "proxy_type",
    "is_crawler",
    "crawler_name",
    "crawler_type",
    "is_tor",
    "threat_level",
    "threat_types"
})
public class Security {

    @JsonProperty("is_proxy")
    private Boolean isProxy;
    @JsonProperty("proxy_type")
    private Object proxyType;
    @JsonProperty("is_crawler")
    private Boolean isCrawler;
    @JsonProperty("crawler_name")
    private Object crawlerName;
    @JsonProperty("crawler_type")
    private Object crawlerType;
    @JsonProperty("is_tor")
    private Boolean isTor;
    @JsonProperty("threat_level")
    private String threatLevel;
    @JsonProperty("threat_types")
    private Object threatTypes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("is_proxy")
    public Boolean getIsProxy() {
        return isProxy;
    }

    @JsonProperty("is_proxy")
    public void setIsProxy(Boolean isProxy) {
        this.isProxy = isProxy;
    }

    @JsonProperty("proxy_type")
    public Object getProxyType() {
        return proxyType;
    }

    @JsonProperty("proxy_type")
    public void setProxyType(Object proxyType) {
        this.proxyType = proxyType;
    }

    @JsonProperty("is_crawler")
    public Boolean getIsCrawler() {
        return isCrawler;
    }

    @JsonProperty("is_crawler")
    public void setIsCrawler(Boolean isCrawler) {
        this.isCrawler = isCrawler;
    }

    @JsonProperty("crawler_name")
    public Object getCrawlerName() {
        return crawlerName;
    }

    @JsonProperty("crawler_name")
    public void setCrawlerName(Object crawlerName) {
        this.crawlerName = crawlerName;
    }

    @JsonProperty("crawler_type")
    public Object getCrawlerType() {
        return crawlerType;
    }

    @JsonProperty("crawler_type")
    public void setCrawlerType(Object crawlerType) {
        this.crawlerType = crawlerType;
    }

    @JsonProperty("is_tor")
    public Boolean getIsTor() {
        return isTor;
    }

    @JsonProperty("is_tor")
    public void setIsTor(Boolean isTor) {
        this.isTor = isTor;
    }

    @JsonProperty("threat_level")
    public String getThreatLevel() {
        return threatLevel;
    }

    @JsonProperty("threat_level")
    public void setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
    }

    @JsonProperty("threat_types")
    public Object getThreatTypes() {
        return threatTypes;
    }

    @JsonProperty("threat_types")
    public void setThreatTypes(Object threatTypes) {
        this.threatTypes = threatTypes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Security.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isProxy");
        sb.append('=');
        sb.append(((this.isProxy == null)?"<null>":this.isProxy));
        sb.append(',');
        sb.append("proxyType");
        sb.append('=');
        sb.append(((this.proxyType == null)?"<null>":this.proxyType));
        sb.append(',');
        sb.append("isCrawler");
        sb.append('=');
        sb.append(((this.isCrawler == null)?"<null>":this.isCrawler));
        sb.append(',');
        sb.append("crawlerName");
        sb.append('=');
        sb.append(((this.crawlerName == null)?"<null>":this.crawlerName));
        sb.append(',');
        sb.append("crawlerType");
        sb.append('=');
        sb.append(((this.crawlerType == null)?"<null>":this.crawlerType));
        sb.append(',');
        sb.append("isTor");
        sb.append('=');
        sb.append(((this.isTor == null)?"<null>":this.isTor));
        sb.append(',');
        sb.append("threatLevel");
        sb.append('=');
        sb.append(((this.threatLevel == null)?"<null>":this.threatLevel));
        sb.append(',');
        sb.append("threatTypes");
        sb.append('=');
        sb.append(((this.threatTypes == null)?"<null>":this.threatTypes));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.isTor == null)? 0 :this.isTor.hashCode()));
        result = ((result* 31)+((this.threatTypes == null)? 0 :this.threatTypes.hashCode()));
        result = ((result* 31)+((this.crawlerType == null)? 0 :this.crawlerType.hashCode()));
        result = ((result* 31)+((this.proxyType == null)? 0 :this.proxyType.hashCode()));
        result = ((result* 31)+((this.crawlerName == null)? 0 :this.crawlerName.hashCode()));
        result = ((result* 31)+((this.isCrawler == null)? 0 :this.isCrawler.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.isProxy == null)? 0 :this.isProxy.hashCode()));
        result = ((result* 31)+((this.threatLevel == null)? 0 :this.threatLevel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Security) == false) {
            return false;
        }
        Security rhs = ((Security) other);
        return ((((((((((this.isTor == rhs.isTor)||((this.isTor!= null)&&this.isTor.equals(rhs.isTor)))&&((this.threatTypes == rhs.threatTypes)||((this.threatTypes!= null)&&this.threatTypes.equals(rhs.threatTypes))))&&((this.crawlerType == rhs.crawlerType)||((this.crawlerType!= null)&&this.crawlerType.equals(rhs.crawlerType))))&&((this.proxyType == rhs.proxyType)||((this.proxyType!= null)&&this.proxyType.equals(rhs.proxyType))))&&((this.crawlerName == rhs.crawlerName)||((this.crawlerName!= null)&&this.crawlerName.equals(rhs.crawlerName))))&&((this.isCrawler == rhs.isCrawler)||((this.isCrawler!= null)&&this.isCrawler.equals(rhs.isCrawler))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.isProxy == rhs.isProxy)||((this.isProxy!= null)&&this.isProxy.equals(rhs.isProxy))))&&((this.threatLevel == rhs.threatLevel)||((this.threatLevel!= null)&&this.threatLevel.equals(rhs.threatLevel))));
    }

}
