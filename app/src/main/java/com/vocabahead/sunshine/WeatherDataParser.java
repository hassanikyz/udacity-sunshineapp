package com.vocabahead.sunshine;

/**
 * Created by hassankhan on 12/25/15.
 */
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {

    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        // TODO: add parsing code here

        try {
            JSONObject jObj = new JSONObject(weatherJsonStr);
            JSONArray list = jObj.getJSONArray("list");
            JSONObject dayObj = list.getJSONObject(dayIndex);
            String maxTempStr = dayObj.getString("max");
            double maxTemp = Double.parseDouble(maxTempStr);
            return maxTemp;
        }
        catch (Exception e) {


        }
        return -1;
    }

}
