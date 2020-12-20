
package dad.javafx.geofx.client.ipapi;

import java.util.ArrayList;
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
    "geoname_id",
    "capital",
    "languages",
    "country_flag",
    "country_flag_emoji",
    "country_flag_emoji_unicode",
    "calling_code",
    "is_eu"
})
public class Location {

    @JsonProperty("geoname_id")
    private Integer geonameId;
    @JsonProperty("capital")
    private String capital;
    @JsonProperty("languages")
    private List<Language> languages = new ArrayList<Language>();
    @JsonProperty("country_flag")
    private String countryFlag;
    @JsonProperty("country_flag_emoji")
    private String countryFlagEmoji;
    @JsonProperty("country_flag_emoji_unicode")
    private String countryFlagEmojiUnicode;
    @JsonProperty("calling_code")
    private String callingCode;
    @JsonProperty("is_eu")
    private Boolean isEu;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("geoname_id")
    public Integer getGeonameId() {
        return geonameId;
    }

    @JsonProperty("geoname_id")
    public void setGeonameId(Integer geonameId) {
        this.geonameId = geonameId;
    }

    @JsonProperty("capital")
    public String getCapital() {
        return capital;
    }

    @JsonProperty("capital")
    public void setCapital(String capital) {
        this.capital = capital;
    }

    @JsonProperty("languages")
    public List<Language> getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    @JsonProperty("country_flag")
    public String getCountryFlag() {
        return countryFlag;
    }

    @JsonProperty("country_flag")
    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    @JsonProperty("country_flag_emoji")
    public String getCountryFlagEmoji() {
        return countryFlagEmoji;
    }

    @JsonProperty("country_flag_emoji")
    public void setCountryFlagEmoji(String countryFlagEmoji) {
        this.countryFlagEmoji = countryFlagEmoji;
    }

    @JsonProperty("country_flag_emoji_unicode")
    public String getCountryFlagEmojiUnicode() {
        return countryFlagEmojiUnicode;
    }

    @JsonProperty("country_flag_emoji_unicode")
    public void setCountryFlagEmojiUnicode(String countryFlagEmojiUnicode) {
        this.countryFlagEmojiUnicode = countryFlagEmojiUnicode;
    }

    @JsonProperty("calling_code")
    public String getCallingCode() {
        return callingCode;
    }

    @JsonProperty("calling_code")
    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }

    @JsonProperty("is_eu")
    public Boolean getIsEu() {
        return isEu;
    }

    @JsonProperty("is_eu")
    public void setIsEu(Boolean isEu) {
        this.isEu = isEu;
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
        sb.append(Location.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("geonameId");
        sb.append('=');
        sb.append(((this.geonameId == null)?"<null>":this.geonameId));
        sb.append(',');
        sb.append("capital");
        sb.append('=');
        sb.append(((this.capital == null)?"<null>":this.capital));
        sb.append(',');
        sb.append("languages");
        sb.append('=');
        sb.append(((this.languages == null)?"<null>":this.languages));
        sb.append(',');
        sb.append("countryFlag");
        sb.append('=');
        sb.append(((this.countryFlag == null)?"<null>":this.countryFlag));
        sb.append(',');
        sb.append("countryFlagEmoji");
        sb.append('=');
        sb.append(((this.countryFlagEmoji == null)?"<null>":this.countryFlagEmoji));
        sb.append(',');
        sb.append("countryFlagEmojiUnicode");
        sb.append('=');
        sb.append(((this.countryFlagEmojiUnicode == null)?"<null>":this.countryFlagEmojiUnicode));
        sb.append(',');
        sb.append("callingCode");
        sb.append('=');
        sb.append(((this.callingCode == null)?"<null>":this.callingCode));
        sb.append(',');
        sb.append("isEu");
        sb.append('=');
        sb.append(((this.isEu == null)?"<null>":this.isEu));
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
        result = ((result* 31)+((this.callingCode == null)? 0 :this.callingCode.hashCode()));
        result = ((result* 31)+((this.capital == null)? 0 :this.capital.hashCode()));
        result = ((result* 31)+((this.countryFlagEmoji == null)? 0 :this.countryFlagEmoji.hashCode()));
        result = ((result* 31)+((this.languages == null)? 0 :this.languages.hashCode()));
        result = ((result* 31)+((this.geonameId == null)? 0 :this.geonameId.hashCode()));
        result = ((result* 31)+((this.countryFlag == null)? 0 :this.countryFlag.hashCode()));
        result = ((result* 31)+((this.countryFlagEmojiUnicode == null)? 0 :this.countryFlagEmojiUnicode.hashCode()));
        result = ((result* 31)+((this.isEu == null)? 0 :this.isEu.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return ((((((((((this.callingCode == rhs.callingCode)||((this.callingCode!= null)&&this.callingCode.equals(rhs.callingCode)))&&((this.capital == rhs.capital)||((this.capital!= null)&&this.capital.equals(rhs.capital))))&&((this.countryFlagEmoji == rhs.countryFlagEmoji)||((this.countryFlagEmoji!= null)&&this.countryFlagEmoji.equals(rhs.countryFlagEmoji))))&&((this.languages == rhs.languages)||((this.languages!= null)&&this.languages.equals(rhs.languages))))&&((this.geonameId == rhs.geonameId)||((this.geonameId!= null)&&this.geonameId.equals(rhs.geonameId))))&&((this.countryFlag == rhs.countryFlag)||((this.countryFlag!= null)&&this.countryFlag.equals(rhs.countryFlag))))&&((this.countryFlagEmojiUnicode == rhs.countryFlagEmojiUnicode)||((this.countryFlagEmojiUnicode!= null)&&this.countryFlagEmojiUnicode.equals(rhs.countryFlagEmojiUnicode))))&&((this.isEu == rhs.isEu)||((this.isEu!= null)&&this.isEu.equals(rhs.isEu))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
