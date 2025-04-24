package spring.intro.services;

import kong.unirest.Unirest;
import org.springframework.stereotype.Service;
import spring.intro.config.TimeApiConfig;
import spring.intro.model.TimeApiResponse;

@Service
public class TimeServiceImpl implements TimeService {

    private TimeApiConfig timeApiConfig;

    public TimeServiceImpl(TimeApiConfig timeApiConfig) {
        this.timeApiConfig = timeApiConfig;
    }

    @Override
    public String getCurrentTime(String timeZone) {

        TimeApiResponse response = Unirest.get(
                timeApiConfig.getEndpoint() + timeApiConfig.getEndpoint() + "/" + timeZone)
                .asObject(TimeApiResponse.class).getBody();
        return response.getUtc_datetime();
    }
}
