
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
    "id",
    "current_time",
    "gmt_offset",
    "code",
    "is_daylight_saving"
})
public class TimeZone {

    @JsonProperty("id")
    private String id;
    @JsonProperty("current_time")
    private String currentTime;
    @JsonProperty("gmt_offset")
    private Integer gmtOffset;
    @JsonProperty("code")
    private String code;
    @JsonProperty("is_daylight_saving")
    private Boolean isDaylightSaving;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("current_time")
    public String getCurrentTime() {
        return currentTime;
    }

    @JsonProperty("current_time")
    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    @JsonProperty("gmt_offset")
    public Integer getGmtOffset() {
        return gmtOffset;
    }

    @JsonProperty("gmt_offset")
    public void setGmtOffset(Integer gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("is_daylight_saving")
    public Boolean getIsDaylightSaving() {
        return isDaylightSaving;
    }

    @JsonProperty("is_daylight_saving")
    public void setIsDaylightSaving(Boolean isDaylightSaving) {
        this.isDaylightSaving = isDaylightSaving;
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
        sb.append(TimeZone.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("currentTime");
        sb.append('=');
        sb.append(((this.currentTime == null)?"<null>":this.currentTime));
        sb.append(',');
        sb.append("gmtOffset");
        sb.append('=');
        sb.append(((this.gmtOffset == null)?"<null>":this.gmtOffset));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("isDaylightSaving");
        sb.append('=');
        sb.append(((this.isDaylightSaving == null)?"<null>":this.isDaylightSaving));
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
        result = ((result* 31)+((this.currentTime == null)? 0 :this.currentTime.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.isDaylightSaving == null)? 0 :this.isDaylightSaving.hashCode()));
        result = ((result* 31)+((this.gmtOffset == null)? 0 :this.gmtOffset.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeZone) == false) {
            return false;
        }
        TimeZone rhs = ((TimeZone) other);
        return (((((((this.currentTime == rhs.currentTime)||((this.currentTime!= null)&&this.currentTime.equals(rhs.currentTime)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.isDaylightSaving == rhs.isDaylightSaving)||((this.isDaylightSaving!= null)&&this.isDaylightSaving.equals(rhs.isDaylightSaving))))&&((this.gmtOffset == rhs.gmtOffset)||((this.gmtOffset!= null)&&this.gmtOffset.equals(rhs.gmtOffset))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
