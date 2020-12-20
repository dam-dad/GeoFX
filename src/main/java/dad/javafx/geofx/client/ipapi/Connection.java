
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
    "asn",
    "isp"
})
public class Connection {

    @JsonProperty("asn")
    private Integer asn;
    @JsonProperty("isp")
    private String isp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("asn")
    public Integer getAsn() {
        return asn;
    }

    @JsonProperty("asn")
    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    @JsonProperty("isp")
    public String getIsp() {
        return isp;
    }

    @JsonProperty("isp")
    public void setIsp(String isp) {
        this.isp = isp;
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
        sb.append(Connection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("asn");
        sb.append('=');
        sb.append(((this.asn == null)?"<null>":this.asn));
        sb.append(',');
        sb.append("isp");
        sb.append('=');
        sb.append(((this.isp == null)?"<null>":this.isp));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.asn == null)? 0 :this.asn.hashCode()));
        result = ((result* 31)+((this.isp == null)? 0 :this.isp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Connection) == false) {
            return false;
        }
        Connection rhs = ((Connection) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.asn == rhs.asn)||((this.asn!= null)&&this.asn.equals(rhs.asn))))&&((this.isp == rhs.isp)||((this.isp!= null)&&this.isp.equals(rhs.isp))));
    }

}
