package reflections.advanced_level.dependency_injection_using_reflection;

class Client {
    @Inject
    private Service service;

    public void execute() {
        service.perform();
    }
}
