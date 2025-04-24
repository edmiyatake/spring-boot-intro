package spring.intro.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// this stamp prevents other properties than what we need from the API
@JsonIgnoreProperties
public class TimeApiResponse {
    private String utc_datetime;

    public TimeApiResponse(String utc_datetime) {
        this.utc_datetime = utc_datetime;
    }

    public String getUtc_datetime(){
        return utc_datetime;
    }

    public void setUtc_datetime(String utc_datetime) {
        this.utc_datetime = utc_datetime;
    }
}
