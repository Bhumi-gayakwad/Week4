package reflections.intermediate_level.access_and_modify_static_fields;

class Configuration {
    private static String API_KEY = "DEFAULT_KEY";

    public static void displayApiKey() {
        System.out.println("Current API Key: " + API_KEY);
    }
}
