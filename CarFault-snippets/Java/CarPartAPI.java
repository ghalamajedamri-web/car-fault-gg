public class CarPartAPI {

    public void fetchCarParts() {

        JSONObject json = JSONParser.makeHttpRequest(URL_CAR_PARTS, "GET", new HashMap<>());

        try {
            int success = json.getInt(TAG_SUCCESS);

            if (success == 1) {
                JSONArray parts = json.getJSONArray(TAG_CAR_PARTS);

                for (int i = 0; i < parts.length(); i++) {
                    JSONObject p = parts.getJSONObject(i);

                    CarPart part = new CarPart(
                            p.getInt("id"),
                            p.getString("name"),
                            p.getString("description"),
                            p.getString("common_issues")
                    );

                    partsList.add(part);
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}public class CarPartAPI {

    ArrayList<CarPart> partsList = new ArrayList<>();

    public void fetchCarParts() {
        // Fetch car parts data from API

        JSONObject json = JSONParser.makeHttpRequest(URL_CAR_PARTS, "GET", new HashMap<>());

        try {
            int success = json.getInt(TAG_SUCCESS);

            if (success == 1) {
                JSONArray parts = json.getJSONArray(TAG_CAR_PARTS);

                for (int i = 0; i < parts.length(); i++) {
                    JSONObject p = parts.getJSONObject(i);

                    CarPart part = new CarPart(
                            p.getInt("id"),
                            p.getString("name"),
                            p.getString("description"),
                            p.getString("common_issues")
                    );

                    partsList.add(part);
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}