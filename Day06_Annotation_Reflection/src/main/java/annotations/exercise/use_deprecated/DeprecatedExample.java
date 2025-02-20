package annotations.use_deprecated;

public class DeprecatedExample {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature(); // Calling deprecated method
        api.newFeature(); // Calling the recommended method
    }
}
